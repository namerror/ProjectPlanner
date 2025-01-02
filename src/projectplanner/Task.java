package projectplanner;

import java.util.Random;
import java.time.Instant;
import java.util.ArrayList;

/* This class defines the task in a project or the subtask of a task */
public class Task extends Template{
    private ArrayList<Task> predecessors; // the predecessors that need to be complete for the task to be completed
    private Template parent; // the parent is either a project or a task
    private boolean finished; // whether the task is finished
    private String note;
    private ArrayList<Resource> resources;
    
    // constructor
    public Task(String title, Template parent) {
        this.parent = parent;
        this.setTitle(title);
        this.finished = false;
        this.setID(this.idGenerator());
        this.setTasks(new ArrayList<>());
        this.resources = new ArrayList<>();
    }
    
    // generates the ID for the task
    private String idGenerator() { 
        Random random = new Random();
        int randomNum = random.nextInt(1000); // generates a random integer from 0-999
        String id = "t_" + randomNum;
        Instant instant = Instant.now();
        id = id + String.valueOf(instant.getEpochSecond()); // the id consists of the random number and the current epoch second
        return id;
    }

    @Override
    public void calculateProgress() {
        if (this.isFinished()) this.setProgress(1); // if a task is finished, the progress should be 1
        else if (!this.getTasks().isEmpty()) {
            float totalTaskDone = 0;
            for (Task task : this.getTasks()) { // counting how many tasks are finished
                totalTaskDone = totalTaskDone + task.getProgress();
            }  
            this.setProgress((float) totalTaskDone / (float)this.getTasks().size());
        }        
        else this.setProgress(0); // if no tasks are added
    }
    
    @Override
    public void calculateCost() {
        float costs = 0;
        for (Task task : this.getTasks()) { // add up the cost of each task
            costs = costs + task.getCost();
        }
        for (Resource r : this.getResources()) { // adding the cost of each resource
            costs = costs + r.getCost();
        }
        this.setCost(costs);
    }
    
    public void deleteResource(Resource r) {
        this.resources.remove(r);
    }
    
    // accessors and mutators
    public boolean isFinished() {
        return this.finished;
    }
    
    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public String getNote() {
        return this.note;
    }
    
    public void setNote(String s) {
        this.note = s;
    }
    
    public void addResource(Resource r) {
        this.resources.add(r);
    }
    
    public ArrayList<Resource> getResources() {
        return this.resources;
    }
}

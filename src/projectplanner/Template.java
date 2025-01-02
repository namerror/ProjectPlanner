package projectplanner;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* This class is to be inherited by both Task and Project since they share a lot of same fields and methods*/

public class Template implements Serializable {
    private ArrayList<Task> tasks; // all the subtasks
    private float progress; 
    private float cost;
    private Date startDate;
    private Date endDate;
    /* abandoned code
    private Date earliest; // earliest startDate in tasks
    private Date latest; // latest endDate in tasks
    */
    private String title;
    private String id;
    private String type; // a project or a task
    
    // adding a subtask to the project or task
    public void addTask(Task task) {
        this.tasks.add(task);
    }
    
    // deletes a specified task from the ArrayList
    public void deleteTask(Task task) { 
        this.tasks.remove(task);
    }
    
    // calculates the progress of the current task or project
    public void calculateProgress() {
        if (!this.tasks.isEmpty()) { // if this project/task has tasks
            float totalTaskDone = 0;
            for (Task task : this.getTasks()) { // counting how many tasks are finished
                totalTaskDone = totalTaskDone + task.getProgress();
            }  
            this.setProgress((float) totalTaskDone / (float)this.getTasks().size());          
        } else this.progress = 0; // if no tasks are added
    }
    
    // calculates the costs for the object (a task or a project)
    public void calculateCost() {
        float costs = 0;
        for (Task task : this.tasks) { // add up the cost of each task
            costs = costs + task.getCost();
        }
        this.cost = costs;
    }
    
    // calculates and returns the duration
    public int getDuration() {
        long diff = this.endDate.getTime() - this.startDate.getTime();
        int range = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); // convert milliseconds to days
        return range + 1; // the actual duration, not just days in between. e.g. from day 7 to day 8 it takes two days
    }
    
    // accessors and mutators
    public ArrayList<Task> getTasks() {
        return this.tasks; // note: this only returns the number of tasks directly belong to the Task/Project, not including all the subtasks
    }
    
    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }
    
    public float getCost() {
        this.calculateCost();
        return this.cost;
    }
    
    public void setCost(float cost) {
        this.cost = cost;
    }
    
    public float getProgress() {
        this.calculateProgress();
        return this.progress;
    }
    
    public void setProgress(float progress) {
        this.progress = progress;
    }
    
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date date) {
        this.startDate = date;
    }
    
    public Date getEndDate() {
        return this.endDate;
    }
    
    public void setEndDate(Date date) {
        this.endDate = date;
    }

/*  abandoned code
    public Date getEarliest() {
        return this.earliest;
    }
    
    public Date getLatest() {
        return this.latest;
    }
*/    
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getID() {
        return this.id;
    }
    
    public void setID(String id) {
        this.id = id;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public int getTaskNum() {
        return this.tasks.size();
    }
}

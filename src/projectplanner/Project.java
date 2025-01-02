package projectplanner;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Random;

public class Project extends Template{
    private float budget; // budget for the project
    private boolean openable; // whether the current project could be opened
    
    public Project() {
        this.setID(idGenerator()); // sets the id for the project
        this.setTitle(this.getID()); // if no title is given, the title is set as the id
        this.setType("project"); // this is a project
        this.setTasks(new ArrayList<>());
        this.budget = 0;
    }
    
    private String idGenerator() { // generates the ID for the project
        Random random = new Random();
        int randomNum = random.nextInt(1000); // generates a random integer from 0-999
        String id = "p_" + randomNum;
        Instant instant = Instant.now();
        id = id + String.valueOf(instant.getEpochSecond()); // the id consists of the random number and the current epoch second
        return id;
    }

    public void save() throws Exception{
        String path = "data\\projects"; // where data is stored
        if (! new File(path).exists()) { // if data folder doesn't exist
            new File(path).mkdirs(); // creates the folder
        }
        File file = new File(path + "\\" + this.getID() + ".dat"); // file name 
        FileOutputStream fout = new FileOutputStream(file);
        ObjectOutputStream oout = new ObjectOutputStream(fout);
        oout.writeObject(this);
        oout.close();        
    }    
    
    public void delete() throws Exception{
        String path = "data\\projects\\";
        File dir = new File(path);
        for (String filename:dir.list()) {
            // delete if the file name is '(ID).dat'
            if (filename.endsWith(".dat")&&filename.startsWith(this.getID())) {
                File file = new File(path + filename);
                file.delete();
            }
        }
    }
    
    // accessors and mutators
    public float getBudget() {
        return this.budget;
    }
    
    public void setBudget(float budget) {
        this.budget = budget;
    }
    
    public void setOpenable(boolean a) {
        this.openable = a;
    }
    
    public boolean isOpenable() {
        return this.openable;
    }
}

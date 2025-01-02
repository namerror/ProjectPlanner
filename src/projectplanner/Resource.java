package projectplanner;

import java.io.Serializable;


public class Resource implements Serializable{
    private String name;
    private float cost;
    private Task task;
    
    public Resource(String name, float cost, Task task) {
        this.name = name;
        this.cost = cost;
        this.task = task;
    }
    
    public String getName() {
        return this.name;
    }
    
    public float getCost() {
        return this.cost;
    }
}

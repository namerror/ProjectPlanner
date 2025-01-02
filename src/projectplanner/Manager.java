package projectplanner;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Manager {
    protected Template template; // this is a project or a task the window belongs to
    protected Project project; // the project this task belongs to
    protected Task currentTask; // if it's a task
    private Task[] taskTable; // a task table that relates the current row number of the JTable and the id of the task
    private Resource[] resourceTable; // like above, deals with the current resources
    
    public Manager() {
    }
    
    public void newTask(String name, Date startDate, Date endDate) throws Exception{
        // end date has to be after start date
        if (endDate.before(startDate)) {
            throw new Exception();
        }
        Task task = new Task(name, this.template);
        task.setStartDate(startDate);
        task.setEndDate(endDate);
        this.template.addTask(task); // add it to the project or task
    }
    
    public String[] getColumns() {
        String col[] = {"Task name", "Start", "Deadline", "Duration (days)", "Cost"};
        return col;
    }
    
    // return a 2D array according to taskTable
    public String[][] getData() {
        String data[][] = new String[this.template.getTaskNum()][5];
        for (int i=0; i<data.length; i++) {
            Task t = this.taskTable[i];
            data[i][0] = t.getTitle();
            data[i][1] = new SimpleDateFormat("dd-MMM-yyyy").format(t.getStartDate()); // Turning Date objects into String with a specific format
            data[i][2] = new SimpleDateFormat("dd-MMM-yyyy").format(t.getEndDate());
            data[i][3] = t.getDuration() + "";
            data[i][4] = String.valueOf(t.getCost());
        }
        return data;
    }
    
    // set the task table according to the order provided
    // returns the current row of the previously selected task
    public int refreshTable(String order, int row) {
        int newRow = -1; // the row to be selected after the update
        Task selected = null;
        if (row!=-1) { // if a row is already selected
            selected = this.taskTable[row];
        }
        
        /* This method is called every time new changes are made to the table, so a new task table is created every time */
        Task[] temp = new Task[this.template.getTaskNum()];
        // collect all tasks stored
        for (int i=0; i<temp.length; i++) {
            temp[i] = this.template.getTasks().get(i); // this stores the object reference of that task in the table
            if (temp[i]==selected) {
                newRow = i; // stores the new row number if this is the prevoius one selected
            }
        }
        /* sort and update taskTable */
        switch(order) {
            case "Default":
                /*
                By default, taskTable is not sorted, 
                thus assigned the value of temp (the array of all tasks)
                */
                this.taskTable = temp;
            break;

            case "Start":
                // <editor-fold desc="Sorting based on start date">
                for (int i=0; i<temp.length; i++) {
                    int earliest = i;
                    for (int j=i+1; j<temp.length; j++) {
                        if (temp[j].getStartDate().before(temp[earliest].getStartDate())) {
                            earliest = j;
                        }
                    }
                    Task s = temp[i];
                    temp[i] = temp[earliest];
                    temp[earliest] = s;
                    if (temp[i]==selected) {
                        newRow = i;
                    }
                }
                this.taskTable = temp;
                // </editor-fold>
            break;
            
            case "Deadline":
                // <editor-fold desc="Sorting based on deadline">
                for (int i=0; i<temp.length; i++) {
                    int earliest = i;
                    for (int j=i+1; j<temp.length; j++) {
                        if (temp[j].getEndDate().before(temp[earliest].getEndDate())) {
                            earliest = j;
                        }
                    }
                    Task s = temp[i];
                    temp[i] = temp[earliest];
                    temp[earliest] = s;
                    if (temp[i]==selected) {
                        newRow = i;
                    }
                }
                this.taskTable = temp;          
                // </editor-fold>
            break;
            
            case "Duration":
                // <editor-fold desc="Sorting based on duration">
                // selection sort
                for (int i=0; i<temp.length; i++) {
                    int max = i;
                    for (int j=i+1; j<temp.length; j++) {
                        if (temp[j].getDuration()>temp[max].getDuration()) {
                            max = j;
                        }
                    }
                    // swap
                    Task s = temp[i];
                    temp[i] = temp[max];
                    temp[max] = s;
                    if (temp[i]==selected) {
                        newRow = i; // stores the new row number if it's the same as the one selected
                    }
                }
                this.taskTable = temp;
                // </editor-fold>
            break;
            
            case "Cost":
                // <editor-fold desc="Sorting based on cost">
                // selection sort
                for (int i=0; i<temp.length; i++) {
                    int max = i;
                    for (int j=i+1; j<temp.length; j++) {
                        if (temp[j].getCost()>temp[max].getCost()) {
                            max = j;
                        }
                    }
                    // swap
                    Task s = temp[i];
                    temp[i] = temp[max];
                    temp[max] = s;
                    if (temp[i]==selected) {
                        newRow = i; // stores the new row number if it's the same as the one selected
                    }
                } 
                this.taskTable = temp;
                // </editor-fold>
            break;            
        } 
        
        return newRow;
    }

    public void applyChanges(int row, String note,String title, Date startDate, Date endDate, boolean finished) throws Exception{
        Task t = this.taskTable[row];
        
        if (title.isBlank()) throw new Exception();
        else if (startDate==null||endDate==null) throw new Exception();
        else if (startDate.after(endDate)) throw new Exception();
        
        t.setNote(note);
        t.setTitle(title);
        t.setStartDate(startDate);
        t.setEndDate(endDate);
        t.setFinished(finished);
    }

    public void addResource(String name, float cost, int row) throws Exception{
        if (name.isBlank()) throw new Exception();
        else if (cost<0) throw new Exception();
        // add this resource
        Resource r = new Resource(name, cost, this.taskTable[row]);
        this.taskTable[row].addResource(r);
    }

    public String[][] getResources(int row) {
        if (row == -1) {
            return new String[][] {};
        }
        /* The method will be called everytime changes are made to the table */
        Task task = this.taskTable[row];
        String[][] resources = new String[task.getResources().size()][2];
        this.resourceTable = new Resource[resources.length];
        
        // returns the resource as a 2D array for the table
        for (int i = 0; i<task.getResources().size(); i++) {
            this.resourceTable[i] = task.getResources().get(i); // add this to the resource table
            resources[i][0] = task.getResources().get(i).getName();
            resources[i][1] = task.getResources().get(i).getCost() + "";
        }
        
        return resources;
    }

    public void deleteResource(int taskRow, int resourceRow) {
        this.taskTable[taskRow].deleteResource(this.resourceTable[resourceRow]);
    }

    public void deleteTask(int row) {
        this.template.deleteTask(this.taskTable[row]); // deletes the task
    }    
    
    public Task getTask(int row) {
        Task t = this.taskTable[row];
        return t;
    }
    
    public Template getTemplate() {
        return this.template;
    }

    // some settings are done specifically for the project
    public Project getProject() {
        return this.project;
    }     
    
    public Task getCurrentTask() {
        return this.currentTask;
    }
}

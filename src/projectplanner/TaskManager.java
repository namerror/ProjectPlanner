package projectplanner;

import java.util.Date;

public class TaskManager extends Manager{
    
    /* acts the same as the project manager, but for subtasks
       maybe I can reconstruct by creating an interface
    */

    public TaskManager(Template template, Project project,Task task) {
        this.template = template; // for the general edits
        this.project = project;
        this.currentTask = task;
    }
    
    public void changeSettings(String name, boolean finished, Date startDate, Date endDate) throws Exception {
        if (startDate.after(endDate)) {
            throw new Exception();
        }
        this.getCurrentTask().setTitle(name);
        this.getCurrentTask().setFinished(finished);
        this.getCurrentTask().setStartDate(startDate);
        this.getCurrentTask().setEndDate(endDate);
    }
}

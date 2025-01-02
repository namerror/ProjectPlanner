package projectplanner;

import java.util.Date;

public class ProjectManager extends Manager{

    public ProjectManager(Template template, Project project) {
        this.template = template;
        this.project = project;
    }
    /* responsible for handling the data transfer and GUI interation in the ProjectFrame */
    
   
    public void changeSettings(String name, float budget, Date startDate, Date endDate) throws Exception{
        if (startDate.after(endDate)) {
            throw new Exception();
        }
        this.getTemplate().setTitle(name);
        this.project.setBudget(budget);
        this.project.setStartDate(startDate);
        this.project.setEndDate(endDate);
    }
    
}

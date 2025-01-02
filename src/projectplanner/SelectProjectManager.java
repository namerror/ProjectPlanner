package projectplanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

/* this class is used to manage all the Project objects and files, and communicate with the GUI class SelectProjectFrame */

public class SelectProjectManager {
    private ArrayList<Project> projects; // stores all the projects here
    private SelectProjectFrame frame; // this links the manager to the frame it's working on
    private Project selectedProject;
    
    // constructor
    public SelectProjectManager(SelectProjectFrame frame) {
        this.setProjectList();
        this.frame = frame;
    }
    
    private void setProjectList() { // responsible for loading projects from files
        this.projects = new ArrayList();
        try {
            File dir = new File("data\\projects");
            dir.mkdirs();
            for (String file:dir.list()) {
                if (file.endsWith(".dat")) { // load files with suffix .dat
                    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data\\projects\\" + file));
                    Project project = (Project) ois.readObject();
                    ois.close();
                    this.projects.add(project);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // returns a String array for the JList
    public String[] getProjects() {
        String[] projectTitles = new String[this.projects.size()]; // this will be returned
        for (int i=0; i<projectTitles.length; i++) {
            projectTitles[i] = this.projects.get(i).getTitle(); // stores all the names in the array
        }
        return projectTitles;
    }
    
    // create a new project
    public Project newProject() {
        Project proj = new Project();
        this.projects.add(proj);
        return proj;
    }
    
    // set the selected project in the SeletProjectFrame
    public void setSelectedProject(String projectName) {
        // search the project with the title and set the current selected value to that project
        for (Project p : this.projects) {
            if (p.getTitle().equals(projectName)) {
                this.selectedProject = p;
            }
        }
    }
    
    // apply changes according to data sent back by the frame
    public void applyChanges(String title, float budget, Date startDate, Date endDate) throws Exception{
        
        // title must not be blank
        if (!title.isBlank()) {
            this.selectedProject.setTitle(title);
        } else throw new Exception();
        
        // budget must not be less than 0
        if (budget>=0) {
            this.selectedProject.setBudget(budget);
        } else throw new Exception();
        
        // Date must be valid
        if (startDate == null || endDate == null) {
            throw new Exception();
        } else if (endDate.before(startDate)) {
            throw new Exception();
        } else {
            this.selectedProject.setStartDate(startDate);
            this.selectedProject.setEndDate(endDate);            
        }
       
    }
    
    public void deleteProject() throws Exception{ // delete the currently selected project
        this.projects.remove(this.selectedProject);
        this.selectedProject.delete();
        this.selectedProject = null;
    }
    
    /* these methods send data to the frame */
    public float getProjectBudget() {
        return this.selectedProject.getBudget(); // sends the budget to the frame
    }
    
    public Date getProjectStartDate() {
        return this.selectedProject.getStartDate(); // sends the starting date to the frame
    }
    
    public Date getProjectEndDate() {
        return this.selectedProject.getEndDate(); // sends the ending date to the frame
    }
    
    public float getProjectProgress() {
        return (this.selectedProject.getProgress() * 100); // return the percentage
    }
    
    
    public Project getSelectedProject() {
        return (this.selectedProject);
    }
    
    
}

package projectplanner;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class SelectProjectFrame extends javax.swing.JFrame {

    private SelectProjectManager manager;
    private String[] projects;
    
    /**
     * Creates new form SelectProject
     */
    public SelectProjectFrame() {
        this.manager = new SelectProjectManager(this); // creates a Manager to handle the data for this frame
        updateProjects(); // update project list
        initComponents();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        errorDialog = new javax.swing.JDialog();
        errorLabel = new javax.swing.JLabel();
        projectScrollPane = new javax.swing.JScrollPane();
        projectList = new javax.swing.JList<>();
        projectNameLabel = new javax.swing.JLabel();
        projectNameField = new javax.swing.JTextField();
        projectBudgetLabel = new javax.swing.JLabel();
        projectBudgetField = new javax.swing.JTextField();
        startDateLabel = new javax.swing.JLabel();
        startDateChooser = new com.toedter.calendar.JDateChooser();
        endDateLabel = new javax.swing.JLabel();
        endDateChooser = new com.toedter.calendar.JDateChooser();
        progressLabel = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        deleteButton = new javax.swing.JButton();
        applyButton = new javax.swing.JButton();
        openButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        newProjectMenu = new javax.swing.JMenu();

        errorDialog.setTitle("Error");
        errorDialog.setAlwaysOnTop(true);
        errorDialog.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        errorDialog.setMinimumSize(new java.awt.Dimension(300, 100));

        errorLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        errorLabel.setText("Invalid input");

        javax.swing.GroupLayout errorDialogLayout = new javax.swing.GroupLayout(errorDialog.getContentPane());
        errorDialog.getContentPane().setLayout(errorDialogLayout);
        errorDialogLayout.setHorizontalGroup(
            errorDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(errorDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        errorDialogLayout.setVerticalGroup(
            errorDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(errorDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(errorLabel)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Select a project");

        String[] s = this.projects;
        projectList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = s;
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        projectList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        projectList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                projectListValueChanged(evt);
            }
        });
        projectScrollPane.setViewportView(projectList);

        projectNameLabel.setText("Project Name:");

        projectNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectNameFieldActionPerformed(evt);
            }
        });

        projectBudgetLabel.setText("Budget:");

        projectBudgetField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectBudgetFieldActionPerformed(evt);
            }
        });

        startDateLabel.setText("From:");

        endDateLabel.setText("To:");

        progressLabel.setText("Progress:");

        progressBar.setString("");
        progressBar.setStringPainted(true);

        deleteButton.setText("Delete Project");
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        applyButton.setText("Apply changes");
        applyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                applyButtonMouseClicked(evt);
            }
        });

        openButton.setText("Open");
        openButton.setEnabled(false);
        openButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openButtonMouseClicked(evt);
            }
        });

        newProjectMenu.setText("New");
        newProjectMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newProjectMenuMouseClicked(evt);
            }
        });
        menuBar.add(newProjectMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(projectScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(projectNameLabel)
                        .addGap(11, 11, 11)
                        .addComponent(projectNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(startDateLabel)
                            .addComponent(projectBudgetLabel)
                            .addComponent(progressLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(projectBudgetField, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(startDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(endDateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(endDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(applyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(openButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(projectScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projectNameLabel)
                    .addComponent(projectNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projectBudgetLabel)
                    .addComponent(projectBudgetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startDateLabel)
                    .addComponent(startDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endDateLabel)
                    .addComponent(endDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(progressLabel)
                    .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(deleteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(applyButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(openButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void projectNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectNameFieldActionPerformed
  
    }//GEN-LAST:event_projectNameFieldActionPerformed

    private void projectBudgetFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectBudgetFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projectBudgetFieldActionPerformed

    private void projectListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_projectListValueChanged
        // When the list item is selected
        String selected = this.projectList.getSelectedValue();
        if (!evt.getValueIsAdjusting()) { // if the changes are not still being made
            if (selected!=null) {
                this.manager.setSelectedProject(selected);
                this.projectNameField.setText(selected); // change the project title field
                this.projectBudgetField.setText(String.valueOf(this.manager.getProjectBudget()));
                this.progressBar.setValue((int) this.manager.getProjectProgress());
                this.progressBar.setString(String.format("%.2f", this.manager.getProjectProgress())+"%");
                this.startDateChooser.setDate(this.manager.getProjectStartDate());
                this.endDateChooser.setDate(this.manager.getProjectEndDate());
                this.openButton.setEnabled(this.manager.getSelectedProject().isOpenable()); 
            } else { // when nothing is selected, refresh all the fields
                this.projectNameField.setText(selected);
                this.projectBudgetField.setText(selected);
                this.progressBar.setValue(0);
                this.progressBar.setString(selected);
                this.startDateChooser.setDate(null);
                this.endDateChooser.setDate(null);  
                this.openButton.setEnabled(false);
            }
        }
    }//GEN-LAST:event_projectListValueChanged

    private void newProjectMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newProjectMenuMouseClicked
        // When the "New" button is clicked:
        this.manager.newProject();
        updateProjects();
    }//GEN-LAST:event_newProjectMenuMouseClicked

    private void applyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applyButtonMouseClicked
        // Apply changes when the Button is clicked
        // check if the input is right
        try { 
            this.manager.applyChanges(this.projectNameField.getText(), 
                    Float.valueOf(this.projectBudgetField.getText()), 
                    this.startDateChooser.getDate(), 
                    this.endDateChooser.getDate());
            this.manager.getSelectedProject().setOpenable(true); // the project is openable
            this.manager.getSelectedProject().save();
            this.updateProjects();
        } catch (Exception e) {
            this.manager.getSelectedProject().setOpenable(false);
            this.openButton.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Please enter valid data", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_applyButtonMouseClicked

    private void openButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openButtonMouseClicked
        // Open the selected project
        ProjectFrame pf = new ProjectFrame(this.manager.getSelectedProject()); // opens the selected project
        pf.setTitle(this.manager.getSelectedProject().getTitle());
        pf.show();
        this.dispose();
    }//GEN-LAST:event_openButtonMouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        // delete the project while the button is clicked
        if (this.manager.getSelectedProject()!=null) { // check whether there is a current project
            int a = JOptionPane.showConfirmDialog(this, "Delete "+this.manager.getSelectedProject().getTitle()+"?", "NO", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {
                try{
                this.manager.deleteProject();
                } catch (Exception e){
                    JOptionPane.showMessageDialog(this, "Something went wrong", "Error", JOptionPane.WARNING_MESSAGE);                
                }
                this.updateProjects();            
        }
        }
    }//GEN-LAST:event_deleteButtonMouseClicked

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applyButton;
    private javax.swing.JButton deleteButton;
    private com.toedter.calendar.JDateChooser endDateChooser;
    private javax.swing.JLabel endDateLabel;
    private javax.swing.JDialog errorDialog;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu newProjectMenu;
    private javax.swing.JButton openButton;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel progressLabel;
    private javax.swing.JTextField projectBudgetField;
    private javax.swing.JLabel projectBudgetLabel;
    private javax.swing.JList<String> projectList;
    private javax.swing.JTextField projectNameField;
    private javax.swing.JLabel projectNameLabel;
    private javax.swing.JScrollPane projectScrollPane;
    private com.toedter.calendar.JDateChooser startDateChooser;
    private javax.swing.JLabel startDateLabel;
    // End of variables declaration//GEN-END:variables

    
    // this method updates the project list
    private void updateProjects(){
        this.projects = this.manager.getProjects(); // set the projects according to the manager class
        if (this.projectList!=null){
            DefaultListModel<String> model = new DefaultListModel<>();
            // update the jList
            for (String s:this.projects) {
                model.addElement(s);
            }
            this.projectList.setModel(model);            
        }
    }
}

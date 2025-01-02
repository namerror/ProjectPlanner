package projectplanner;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class TaskFrame extends javax.swing.JFrame {
    
    private TaskManager manager;
    
    public TaskFrame(Task task, Project project) {
        this.manager = new TaskManager(task, project, task);
        initComponents(); // initialization of the GUI elements
        setElements(); // set elements according to back-end data
        updateDetails(); // update the detail panel
        updateTable(); // update the task table
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addTaskFrame = new javax.swing.JFrame();
        endDateChooser1 = new com.toedter.calendar.JDateChooser();
        startDateLabel1 = new javax.swing.JLabel();
        endDateLabel1 = new javax.swing.JLabel();
        okAddTaskButton = new javax.swing.JButton();
        cancelAddTaskButton = new javax.swing.JButton();
        taskNameLabel1 = new javax.swing.JLabel();
        taskNameField = new javax.swing.JTextField();
        startDateChooser1 = new com.toedter.calendar.JDateChooser();
        addResourceFrame = new javax.swing.JFrame();
        resourceNameField = new javax.swing.JTextField();
        resourceNameLabel = new javax.swing.JLabel();
        resourceCostLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        cancelResourceButton = new javax.swing.JButton();
        resourceCostField = new javax.swing.JTextField();
        settingsFrame = new javax.swing.JFrame();
        taskNameSettingLabel = new javax.swing.JLabel();
        taskNameSettingField = new javax.swing.JTextField();
        fromSettingLabel = new javax.swing.JLabel();
        fromSettingDateChooser = new com.toedter.calendar.JDateChooser();
        toSettingLabel = new javax.swing.JLabel();
        toSettingDateChooser = new com.toedter.calendar.JDateChooser();
        cancelButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        finishedSettingBox = new javax.swing.JCheckBox();
        taskInfoPanel = new javax.swing.JPanel();
        taskNameLabel = new javax.swing.JLabel();
        taskName = new javax.swing.JLabel();
        totalCostLabel = new javax.swing.JLabel();
        totalCost = new javax.swing.JLabel();
        fromDateLabel = new javax.swing.JLabel();
        startDate = new javax.swing.JLabel();
        toDateLabel = new javax.swing.JLabel();
        endDate = new javax.swing.JLabel();
        progressLabel = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        settingsButton = new javax.swing.JButton();
        tableScrollPane = new javax.swing.JScrollPane();
        taskTable = new javax.swing.JTable();
        taskNum = new javax.swing.JLabel();
        taskNumLabel = new javax.swing.JLabel();
        detailFrame = new javax.swing.JInternalFrame();
        noteScrollPane = new javax.swing.JScrollPane();
        noteArea = new javax.swing.JTextArea();
        attPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        titleField = new javax.swing.JTextField();
        costLabel = new javax.swing.JLabel();
        costValue = new javax.swing.JLabel();
        toSubtaskButton = new javax.swing.JButton();
        startDateLabel = new javax.swing.JLabel();
        startDateChooser = new com.toedter.calendar.JDateChooser();
        endDateLabel = new javax.swing.JLabel();
        endDateChooser = new com.toedter.calendar.JDateChooser();
        finishedCheckBox = new javax.swing.JCheckBox();
        taskProgressLabel = new javax.swing.JLabel();
        progressValueLabel = new javax.swing.JLabel();
        applyButton = new javax.swing.JButton();
        resourceScrollPane = new javax.swing.JScrollPane();
        resourceTable = new javax.swing.JTable();
        deleteResourceButton1 = new javax.swing.JButton();
        addResourceButton = new javax.swing.JButton();
        orderLabel = new javax.swing.JLabel();
        orderBox = new javax.swing.JComboBox<>();
        menuBar = new javax.swing.JMenuBar();
        editMenu = new javax.swing.JMenu();
        addSubtaskItem = new javax.swing.JMenuItem();
        deleteSubtaskItem = new javax.swing.JMenuItem();

        addTaskFrame.setBounds(new java.awt.Rectangle(200, 100, 400, 230));

        startDateLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        startDateLabel1.setText("Start date:");

        endDateLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        endDateLabel1.setText("End date:");

        okAddTaskButton.setText("OK");
        okAddTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okAddTaskButtonActionPerformed(evt);
            }
        });

        cancelAddTaskButton.setText("Cancel");
        cancelAddTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelAddTaskButtonActionPerformed(evt);
            }
        });

        taskNameLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        taskNameLabel1.setText("Task name:");

        taskNameField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout addTaskFrameLayout = new javax.swing.GroupLayout(addTaskFrame.getContentPane());
        addTaskFrame.getContentPane().setLayout(addTaskFrameLayout);
        addTaskFrameLayout.setHorizontalGroup(
            addTaskFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addTaskFrameLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(addTaskFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(taskNameLabel1)
                    .addComponent(startDateLabel1)
                    .addComponent(endDateLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addTaskFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addTaskFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(addTaskFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(taskNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(startDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(addTaskFrameLayout.createSequentialGroup()
                            .addComponent(cancelAddTaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(25, 25, 25)
                            .addComponent(okAddTaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(endDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        addTaskFrameLayout.setVerticalGroup(
            addTaskFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addTaskFrameLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(addTaskFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addTaskFrameLayout.createSequentialGroup()
                        .addGroup(addTaskFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(taskNameLabel1)
                            .addComponent(taskNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(startDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(startDateLabel1))
                .addGap(18, 18, 18)
                .addGroup(addTaskFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(endDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endDateLabel1))
                .addGap(18, 18, 18)
                .addGroup(addTaskFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okAddTaskButton)
                    .addComponent(cancelAddTaskButton))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        addResourceFrame.setSize(new java.awt.Dimension(380, 180));

        resourceNameField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        resourceNameField.setText("new resource");

        resourceNameLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        resourceNameLabel.setText("Resource name:");

        resourceCostLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        resourceCostLabel.setText("Cost:");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        cancelResourceButton.setText("Cancel");
        cancelResourceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelResourceButtonActionPerformed(evt);
            }
        });

        resourceCostField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        resourceCostField.setText("0");

        javax.swing.GroupLayout addResourceFrameLayout = new javax.swing.GroupLayout(addResourceFrame.getContentPane());
        addResourceFrame.getContentPane().setLayout(addResourceFrameLayout);
        addResourceFrameLayout.setHorizontalGroup(
            addResourceFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addResourceFrameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(addResourceFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resourceNameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(resourceCostLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addResourceFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addResourceFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(addResourceFrameLayout.createSequentialGroup()
                            .addComponent(cancelResourceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(resourceNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(resourceCostField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );
        addResourceFrameLayout.setVerticalGroup(
            addResourceFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addResourceFrameLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(addResourceFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resourceNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resourceNameLabel))
                .addGap(18, 18, 18)
                .addGroup(addResourceFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resourceCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resourceCostField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addResourceFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(cancelResourceButton))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        settingsFrame.setBounds(new java.awt.Rectangle(100, 100, 350, 250));

        taskNameSettingLabel.setText("Task name:");

        fromSettingLabel.setText("From:");

        toSettingLabel.setText("To:");

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        finishedSettingBox.setText("Finished");

        javax.swing.GroupLayout settingsFrameLayout = new javax.swing.GroupLayout(settingsFrame.getContentPane());
        settingsFrame.getContentPane().setLayout(settingsFrameLayout);
        settingsFrameLayout.setHorizontalGroup(
            settingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsFrameLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(settingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingsFrameLayout.createSequentialGroup()
                        .addGroup(settingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(toSettingLabel)
                            .addComponent(fromSettingLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(settingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fromSettingDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toSettingDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(settingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(settingsFrameLayout.createSequentialGroup()
                            .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                            .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, settingsFrameLayout.createSequentialGroup()
                            .addComponent(taskNameSettingLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(taskNameSettingField)))
                    .addComponent(finishedSettingBox, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        settingsFrameLayout.setVerticalGroup(
            settingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsFrameLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(settingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taskNameSettingLabel)
                    .addComponent(taskNameSettingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(finishedSettingBox)
                .addGap(12, 12, 12)
                .addGroup(settingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fromSettingLabel)
                    .addComponent(fromSettingDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(settingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toSettingLabel)
                    .addComponent(toSettingDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(settingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelButton)
                    .addComponent(okButton))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        taskInfoPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        taskNameLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        taskNameLabel.setText("Task Name:");

        taskName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        taskName.setText("xxx");

        totalCostLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        totalCostLabel.setText("Total Cost:");

        totalCost.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        totalCost.setText("xxx");

        fromDateLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        fromDateLabel.setText("From:");

        startDate.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        startDate.setText("xxx-xxx-xxxx");

        toDateLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        toDateLabel.setText("To:");

        endDate.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        endDate.setText("xxx-xxx-xxxx");

        progressLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        progressLabel.setText("Progress:");

        progressBar.setStringPainted(true);

        settingsButton.setText("Settings");
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout taskInfoPanelLayout = new javax.swing.GroupLayout(taskInfoPanel);
        taskInfoPanel.setLayout(taskInfoPanelLayout);
        taskInfoPanelLayout.setHorizontalGroup(
            taskInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taskInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(taskInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(totalCostLabel)
                    .addComponent(taskNameLabel)
                    .addComponent(fromDateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(taskInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(taskInfoPanelLayout.createSequentialGroup()
                        .addComponent(taskName, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(taskInfoPanelLayout.createSequentialGroup()
                        .addGroup(taskInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(taskInfoPanelLayout.createSequentialGroup()
                                .addComponent(totalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(progressLabel))
                            .addGroup(taskInfoPanelLayout.createSequentialGroup()
                                .addComponent(startDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(toDateLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(taskInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(endDate)
                            .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        taskInfoPanelLayout.setVerticalGroup(
            taskInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taskInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(taskInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taskNameLabel)
                    .addComponent(taskName)
                    .addComponent(settingsButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(taskInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(taskInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(totalCostLabel)
                        .addComponent(totalCost)
                        .addComponent(progressLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(taskInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromDateLabel)
                    .addComponent(startDate)
                    .addComponent(toDateLabel)
                    .addComponent(endDate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        taskTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        taskTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        taskTable.setCellSelectionEnabled(false);
        taskTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        taskTable.setMinimumSize(new java.awt.Dimension(100, 320));
        taskTable.setPreferredSize(null);
        taskTable.setRowHeight(20);
        taskTable.setRowSelectionAllowed(true);
        taskTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        taskTable.setShowGrid(true);
        taskTable.getTableHeader().setReorderingAllowed(false);
        tableScrollPane.setViewportView(taskTable);
        this.taskTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // whenever a new task is selected, update the details in the details panel
                if (!e.getValueIsAdjusting()) {
                    updateDetails();
                }
            }
        });

        taskNum.setText("xxx");

        taskNumLabel.setText("Number of  subtasks:");

        detailFrame.setVisible(true);

        noteArea.setColumns(20);
        noteArea.setRows(5);
        noteArea.setText("Add some notes for the task");
        noteScrollPane.setViewportView(noteArea);

        attPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        titleLabel.setText("Title");

        titleField.setText("jTextField1");
        titleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleFieldActionPerformed(evt);
            }
        });

        costLabel.setText("Cost");

        costValue.setText("Cost");

        toSubtaskButton.setText("To Subtask");
        toSubtaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toSubtaskButtonActionPerformed(evt);
            }
        });

        startDateLabel.setText("From");

        endDateLabel.setText("To");

        finishedCheckBox.setText("Finished");

        taskProgressLabel.setText("Progress");

        progressValueLabel.setText("0");

        applyButton.setText("Apply");
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout attPanelLayout = new javax.swing.GroupLayout(attPanel);
        attPanel.setLayout(attPanelLayout);
        attPanelLayout.setHorizontalGroup(
            attPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(attPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(attPanelLayout.createSequentialGroup()
                        .addGroup(attPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(attPanelLayout.createSequentialGroup()
                                .addComponent(titleLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(attPanelLayout.createSequentialGroup()
                                .addGroup(attPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(startDateLabel)
                                    .addComponent(costLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(attPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(attPanelLayout.createSequentialGroup()
                                        .addComponent(startDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(endDateLabel))
                                    .addComponent(costValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(attPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(attPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(toSubtaskButton)
                                .addGap(22, 22, 22))
                            .addGroup(attPanelLayout.createSequentialGroup()
                                .addGroup(attPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(attPanelLayout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(applyButton))
                                    .addGroup(attPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(endDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(24, Short.MAX_VALUE))))
                    .addGroup(attPanelLayout.createSequentialGroup()
                        .addGroup(attPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(finishedCheckBox)
                            .addGroup(attPanelLayout.createSequentialGroup()
                                .addComponent(taskProgressLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(progressValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        attPanelLayout.setVerticalGroup(
            attPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(attPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(attPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(titleLabel)
                        .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(toSubtaskButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(attPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costLabel)
                    .addComponent(costValue))
                .addGap(10, 10, 10)
                .addGroup(attPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startDateLabel)
                    .addComponent(startDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endDateLabel)
                    .addComponent(endDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(finishedCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(attPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taskProgressLabel)
                    .addComponent(progressValueLabel)
                    .addComponent(applyButton))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        resourceScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        resourceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        resourceTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        resourceScrollPane.setViewportView(resourceTable);

        deleteResourceButton1.setText("Delete resource");
        deleteResourceButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteResourceButton1ActionPerformed(evt);
            }
        });

        addResourceButton.setText("Add resource");
        addResourceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addResourceButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout detailFrameLayout = new javax.swing.GroupLayout(detailFrame.getContentPane());
        detailFrame.getContentPane().setLayout(detailFrameLayout);
        detailFrameLayout.setHorizontalGroup(
            detailFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resourceScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(attPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(noteScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                    .addGroup(detailFrameLayout.createSequentialGroup()
                        .addComponent(deleteResourceButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addResourceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        detailFrameLayout.setVerticalGroup(
            detailFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(noteScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(attPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resourceScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(detailFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteResourceButton1)
                    .addComponent(addResourceButton)))
        );

        orderLabel.setText("Order:");

        orderBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "Deadline", "Start", "Duration", "Cost" }));
        orderBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                orderBoxItemStateChanged(evt);
            }
        });

        editMenu.setText("Edit");

        addSubtaskItem.setText("Add Subtask");
        addSubtaskItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSubtaskItemActionPerformed(evt);
            }
        });
        editMenu.add(addSubtaskItem);

        deleteSubtaskItem.setText("Delete Subtask");
        deleteSubtaskItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSubtaskItemActionPerformed(evt);
            }
        });
        editMenu.add(deleteSubtaskItem);

        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(taskNumLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(taskNum, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(orderLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orderBox, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tableScrollPane)
                    .addComponent(taskInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detailFrame)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(taskInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(taskNumLabel)
                            .addComponent(taskNum)
                            .addComponent(orderLabel)
                            .addComponent(orderBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(detailFrame))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addSubtaskItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSubtaskItemActionPerformed
        this.taskNameField.setText("new task");
        this.startDateChooser1.setDate(null);
        this.endDateChooser1.setDate(null);
        this.addTaskFrame.show();
    }//GEN-LAST:event_addSubtaskItemActionPerformed

    private void titleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleFieldActionPerformed

    private void okAddTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okAddTaskButtonActionPerformed
        // adding a new task
        try {
            this.manager.newTask(this.taskNameField.getText(), this.startDateChooser1.getDate(), this.endDateChooser1.getDate());
            this.addTaskFrame.dispose();
            this.updateTable();
        } catch (Exception e) {
            e.printStackTrace();
            // error message
            JOptionPane.showMessageDialog(this, "Please enter valid data.\n"
                + "1. The fields can't be left empty\n2. End date cannot be before start date", "Error", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_okAddTaskButtonActionPerformed

    private void cancelAddTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelAddTaskButtonActionPerformed
        this.addTaskFrame.dispose();
    }//GEN-LAST:event_cancelAddTaskButtonActionPerformed

    private void toSubtaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toSubtaskButtonActionPerformed
        // open a new window 
        int taskRow = this.taskTable.getSelectedRow();
        if (taskRow != -1) {
            TaskFrame tf = new TaskFrame(this.manager.getTask(taskRow), this.manager.getProject());
            tf.setTitle(this.manager.getProject().getTitle()+": "+this.manager.getTask(taskRow).getTitle());
        }
    }//GEN-LAST:event_toSubtaskButtonActionPerformed

    private void orderBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_orderBoxItemStateChanged
        // when a new item is selected
        if(evt.getStateChange()==1) {
            this.updateTable();
        }
    }//GEN-LAST:event_orderBoxItemStateChanged

    private void deleteSubtaskItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSubtaskItemActionPerformed
        if (this.taskTable.getSelectedRow()!=-1) {
            this.manager.deleteTask(this.taskTable.getSelectedRow());
            this.updateTable();
        }
    }//GEN-LAST:event_deleteSubtaskItemActionPerformed

    private void addResourceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addResourceButtonActionPerformed
        if (this.taskTable.getSelectedRow()==-1) {
            JOptionPane.showMessageDialog(this, "Choose a task first", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            this.resourceNameField.setText("");
            this.resourceCostField.setText("0");
            this.addResourceFrame.setVisible(true);
        }

    }//GEN-LAST:event_addResourceButtonActionPerformed

    private void deleteResourceButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteResourceButton1ActionPerformed
        int taskRow = this.taskTable.getSelectedRow();
        int resourceRow = this.resourceTable.getSelectedRow();
        if (taskRow != -1 && resourceRow != -1) {
            this.manager.deleteResource(taskRow, resourceRow);
            this.updateDetails();
            this.updateTable();
        }
    }//GEN-LAST:event_deleteResourceButton1ActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        try {
            this.manager.addResource(this.resourceNameField.getText(), Float.valueOf(this.resourceCostField.getText()), this.taskTable.getSelectedRow());
            this.updateDetails();
            this.updateTable();
            this.addResourceFrame.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid input", "Error", JOptionPane.WARNING_MESSAGE);
            e.printStackTrace();
        }

    }//GEN-LAST:event_addButtonActionPerformed

    private void cancelResourceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelResourceButtonActionPerformed
        // closes the window
        this.addResourceFrame.dispose();
    }//GEN-LAST:event_cancelResourceButtonActionPerformed

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        this.taskNameSettingField.setText(this.manager.getCurrentTask().getTitle());
        this.finishedSettingBox.setSelected(this.manager.getCurrentTask().isFinished());
        this.fromSettingDateChooser.setDate(this.manager.getCurrentTask().getStartDate());
        this.toSettingDateChooser.setDate(this.manager.getCurrentTask().getEndDate());
        this.settingsFrame.setVisible(true);
    }//GEN-LAST:event_settingsButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.settingsFrame.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        try {
            this.manager.changeSettings(this.taskNameSettingField.getText(), this.finishedSettingBox.isSelected(), this.fromSettingDateChooser.getDate(), this.toSettingDateChooser.getDate());
            this.setElements();            
            this.settingsFrame.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Something went wrong", "Error", JOptionPane.WARNING_MESSAGE);            
        }
    }//GEN-LAST:event_okButtonActionPerformed

    private void applyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyButtonActionPerformed
        try {
            this.manager.applyChanges(this.taskTable.getSelectedRow(), 
                                      this.noteArea.getText(), 
                                      this.titleField.getText(), 
                                      this.startDateChooser.getDate(), 
                                      this.endDateChooser.getDate(), 
                                      this.finishedCheckBox.isSelected());
            this.updateTable();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Something went wrong", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_applyButtonActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        setElements();
        updateDetails();
        updateTable();
    }//GEN-LAST:event_formWindowGainedFocus

    private void setElements() {
        this.taskName.setText(this.manager.getCurrentTask().getTitle());
        this.totalCost.setText(String.valueOf(this.manager.getCurrentTask().getCost()));
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd yyyy");
        this.startDate.setText(sdf.format(this.manager.getCurrentTask().getStartDate()));
        this.endDate.setText(sdf.format(this.manager.getCurrentTask().getEndDate()));
        this.progressBar.setValue((int)(this.manager.getCurrentTask().getProgress() * 100));
        this.progressBar.setString(String.format("%.2f", this.manager.getCurrentTask().getProgress() * 100) + "%");
        // sets the maximum and minimum selectable dates according to the project
        this.startDateChooser.setMinSelectableDate(this.manager.getCurrentTask().getStartDate());
        this.startDateChooser.setMaxSelectableDate(this.manager.getCurrentTask().getEndDate());
        this.fromSettingDateChooser.setMinSelectableDate(this.manager.getProject().getStartDate());
        this.fromSettingDateChooser.setMaxSelectableDate(this.manager.getProject().getEndDate());
        this.endDateChooser.setMinSelectableDate(this.manager.getCurrentTask().getStartDate());        
        this.endDateChooser.setMaxSelectableDate(this.manager.getCurrentTask().getEndDate());
        this.startDateChooser1.setMinSelectableDate(this.manager.getCurrentTask().getStartDate());
        this.startDateChooser1.setMaxSelectableDate(this.manager.getCurrentTask().getEndDate());        
        this.endDateChooser1.setMinSelectableDate(this.manager.getCurrentTask().getStartDate());
        this.endDateChooser1.setMaxSelectableDate(this.manager.getCurrentTask().getEndDate());
    }
    
    public void updateDetails() {
        try {
            if (this.taskTable.getSelectedRow()!=-1){
                this.toSubtaskButton.setEnabled(true);
                Task t = this.manager.getTask(this.taskTable.getSelectedRow()); 
                this.noteArea.setText(t.getNote());
                this.titleField.setText(t.getTitle());
                this.costValue.setText(t.getCost()+"");
                this.startDateChooser.setDate(t.getStartDate());
                this.endDateChooser.setDate(t.getEndDate());
                this.finishedCheckBox.setSelected(t.isFinished());
                this.progressValueLabel.setText(t.getProgress() * 100 + "%");
                this.setElements();
                this.updateResourceTable();
            } else {
                // clear everything
                this.noteArea.setText("");
                this.titleField.setText("");
                this.costValue.setText("");
                this.startDateChooser.setDate(null);
                this.endDateChooser.setDate(null);
                this.finishedCheckBox.setSelected(false);
                this.progressValueLabel.setText("");
                this.updateResourceTable();
                this.toSubtaskButton.setEnabled(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Something went wrong", "Error", JOptionPane.WARNING_MESSAGE);
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton addResourceButton;
    private javax.swing.JFrame addResourceFrame;
    private javax.swing.JMenuItem addSubtaskItem;
    private javax.swing.JFrame addTaskFrame;
    private javax.swing.JButton applyButton;
    private javax.swing.JPanel attPanel;
    private javax.swing.JButton cancelAddTaskButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton cancelResourceButton;
    private javax.swing.JLabel costLabel;
    private javax.swing.JLabel costValue;
    private javax.swing.JButton deleteResourceButton1;
    private javax.swing.JMenuItem deleteSubtaskItem;
    private javax.swing.JInternalFrame detailFrame;
    private javax.swing.JMenu editMenu;
    private javax.swing.JLabel endDate;
    private com.toedter.calendar.JDateChooser endDateChooser;
    private com.toedter.calendar.JDateChooser endDateChooser1;
    private javax.swing.JLabel endDateLabel;
    private javax.swing.JLabel endDateLabel1;
    private javax.swing.JCheckBox finishedCheckBox;
    private javax.swing.JCheckBox finishedSettingBox;
    private javax.swing.JLabel fromDateLabel;
    private com.toedter.calendar.JDateChooser fromSettingDateChooser;
    private javax.swing.JLabel fromSettingLabel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextArea noteArea;
    private javax.swing.JScrollPane noteScrollPane;
    private javax.swing.JButton okAddTaskButton;
    private javax.swing.JButton okButton;
    private javax.swing.JComboBox<String> orderBox;
    private javax.swing.JLabel orderLabel;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel progressLabel;
    private javax.swing.JLabel progressValueLabel;
    private javax.swing.JTextField resourceCostField;
    private javax.swing.JLabel resourceCostLabel;
    private javax.swing.JTextField resourceNameField;
    private javax.swing.JLabel resourceNameLabel;
    private javax.swing.JScrollPane resourceScrollPane;
    private javax.swing.JTable resourceTable;
    private javax.swing.JButton settingsButton;
    private javax.swing.JFrame settingsFrame;
    private javax.swing.JLabel startDate;
    private com.toedter.calendar.JDateChooser startDateChooser;
    private com.toedter.calendar.JDateChooser startDateChooser1;
    private javax.swing.JLabel startDateLabel;
    private javax.swing.JLabel startDateLabel1;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JPanel taskInfoPanel;
    private javax.swing.JLabel taskName;
    private javax.swing.JTextField taskNameField;
    private javax.swing.JLabel taskNameLabel;
    private javax.swing.JLabel taskNameLabel1;
    private javax.swing.JTextField taskNameSettingField;
    private javax.swing.JLabel taskNameSettingLabel;
    private javax.swing.JLabel taskNum;
    private javax.swing.JLabel taskNumLabel;
    private javax.swing.JLabel taskProgressLabel;
    private javax.swing.JTable taskTable;
    private javax.swing.JTextField titleField;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel toDateLabel;
    private com.toedter.calendar.JDateChooser toSettingDateChooser;
    private javax.swing.JLabel toSettingLabel;
    private javax.swing.JButton toSubtaskButton;
    private javax.swing.JLabel totalCost;
    private javax.swing.JLabel totalCostLabel;
    // End of variables declaration//GEN-END:variables

    private void updateTable() {
        int row = this.taskTable.getSelectedRow(); // pre-store what's been selected
        this.taskNum.setText(String.valueOf(this.manager.getCurrentTask().getTaskNum()));
        int newRow = this.manager.refreshTable(this.orderBox.getSelectedItem().toString(), row); // refreshes the table accordingly
        DefaultTableModel model = new DefaultTableModel(this.manager.getData(), this.manager.getColumns()) {
            /* prevents user from editing the cells */
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        this.taskTable.setModel(model);
        if (newRow!=-1 && this.taskTable.getRowCount()!=0) this.taskTable.setRowSelectionInterval(newRow, newRow); // this is to keep the row selected after updating
    }

    private void updateResourceTable() {
        // update the resource table
        DefaultTableModel model = new DefaultTableModel(this.manager.getResources(this.taskTable.getSelectedRow()),
                new String[] {"Resource", "Cost"}) {
                /* not editable */
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
        };
        this.resourceTable.setModel(model);    
    }
}

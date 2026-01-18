/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todoapp.ui;

/**
 *
 * @author Admin
 */
import com.todoapp.controller.TaskManager;
import com.todoapp.model.Task;

import javax.swing.*;
import java.awt.*;

public class TaskForm extends JDialog {

    private JTextField txtId, txtName;
    private JTextArea txtDescription;
    private JComboBox<String> cmbStatus;
    private TaskManager taskManager;
    private MainWindow mainWindow;

    public TaskForm(MainWindow mainWindow, TaskManager taskManager) {
        this.mainWindow = mainWindow;
        this.taskManager = taskManager;

        setTitle("Add Task");
        setSize(400, 350);
        setLocationRelativeTo(mainWindow);
        setModal(false);

        initComponents();
    }

    private void initComponents() {
        setLayout(new GridLayout(5, 2, 5, 5));

        txtId = new JTextField(String.valueOf(taskManager.generateTaskId()));
        txtId.setEditable(false);

        txtName = new JTextField();
        txtDescription = new JTextArea(3, 20);
        cmbStatus = new JComboBox<>(new String[]{
                "NOT STARTED", "ONGOING", "DONE"
        });

        JButton btnSave = new JButton("Save Task");
        btnSave.addActionListener(e -> saveTask());

        add(new JLabel("Task ID:"));
        add(txtId);
        add(new JLabel("Task Name:"));
        add(txtName);
        add(new JLabel("Description:"));
        add(new JScrollPane(txtDescription));
        add(new JLabel("Status:"));
        add(cmbStatus);
        add(new JLabel());
        add(btnSave);
    }

    private void saveTask() {
        if (txtName.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Task name is required.");
            return;
        }

        Task task = new Task(
                Integer.parseInt(txtId.getText()),
                txtName.getText(),
                txtDescription.getText(),
                cmbStatus.getSelectedItem().toString()
        );

        taskManager.addTask(task);
        mainWindow.refreshTable();
        dispose();
    }
}
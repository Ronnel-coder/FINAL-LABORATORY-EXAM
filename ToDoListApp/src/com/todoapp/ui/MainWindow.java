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
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class MainWindow extends JFrame {

    private TaskManager taskManager;
    private JTable table;
    private DefaultTableModel tableModel;
    private TaskForm taskForm;

    public MainWindow(TaskManager taskManager) {
        this.taskManager = taskManager;
        setTitle("To-Do List Application");
        setSize(700, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initComponents();
    }

    private void initComponents() {
        JButton addButton = new JButton("Add Task");
        addButton.addActionListener(e -> openTaskForm());

        tableModel = new DefaultTableModel(
                new Object[]{"Task ID", "Task Name", "Task Description", "Status"}, 0
        );
        table = new JTable(tableModel);

        add(addButton, BorderLayout.NORTH);
        add(new JScrollPane(table), BorderLayout.CENTER);
    }

    private void openTaskForm() {
        if (taskForm == null || !taskForm.isDisplayable()) {
            taskForm = new TaskForm(this, taskManager);
            taskForm.setVisible(true);
        }
    }

    public void refreshTable() {
        tableModel.setRowCount(0);
        for (Task task : taskManager.getAllTasks()) {
            tableModel.addRow(new Object[]{
                    task.getTaskId(),
                    task.getTaskName(),
                    task.getTaskDescription(),
                    task.getStatus()
            });
        }
    }
}
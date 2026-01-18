/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todoapp.model;

/**
 *
 * @author Admin
 */
public abstract class AbstractTask {

    protected int taskId;
    protected String taskName;
    protected String taskDescription;

    // Default constructor
    public AbstractTask() {
    }

    // Parameterized constructor
    public AbstractTask(int taskId, String taskName, String taskDescription) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }

    // Abstract methods for status
    public abstract String getStatus();
    public abstract void setStatus(String status);

    // Getters and setters
    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
}
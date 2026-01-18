/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todoapp.model;

/**
 *
 * @author Admin
 */
public class Task extends AbstractTask {

    private String status;

    public static final String NOT_STARTED = "NOT STARTED";
    public static final String ONGOING = "ONGOING";
    public static final String DONE = "DONE";

    public Task(int taskId, String taskName, String taskDescription, String status) {
        super(taskId, taskName, taskDescription);
        setStatus(status);
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        if (status.equals(NOT_STARTED) || status.equals(ONGOING) || status.equals(DONE)) {
            this.status = status;
        } else {
            this.status = NOT_STARTED;
        }
    }
}
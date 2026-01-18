/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todoapp.model;

public class TimedTask extends Task {

    private int estimatedMinutes;

    public TimedTask(int taskId, String taskName, String taskDescription,
                     String status, int estimatedMinutes) {
        super(taskId, taskName, taskDescription, status);
        this.estimatedMinutes = estimatedMinutes;
    }

    public int getEstimatedMinutes() {
        return estimatedMinutes;
    }

    public void setEstimatedMinutes(int estimatedMinutes) {
        if (estimatedMinutes >= 0) {
            this.estimatedMinutes = estimatedMinutes;
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todoapp.controller;

/**
 *
 * @author Admin
 */
import com.todoapp.model.Task;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private final List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    public int generateTaskId() {
        return tasks.size() + 1;
    }
}
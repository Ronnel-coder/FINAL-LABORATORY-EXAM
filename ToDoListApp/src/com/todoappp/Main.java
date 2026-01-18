/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todoappp;

/**
 *
 * @author Admin
 */


import com.todoapp.controller.TaskManager;
import com.todoapp.ui.MainWindow;

public class Main {

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        new MainWindow(taskManager).setVisible(true);
    }
}

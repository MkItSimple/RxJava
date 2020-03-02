package com.example.rxjava.util;

import com.example.rxjava.models.Task;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    public static List<Task> createTaskList(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Take our the trash", true, 3));
        tasks.add(new Task("Walk the dog", true, 2));
        tasks.add(new Task("Make my bed", true, 1));
        tasks.add(new Task("Unload the dishwasher", true, 0));
        tasks.add(new Task("Make a dinner", true, 5));
        return tasks;
    }
}

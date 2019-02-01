package com.stefanbanu.tasks.service;

import com.stefanbanu.tasks.model.Task;

public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);

}

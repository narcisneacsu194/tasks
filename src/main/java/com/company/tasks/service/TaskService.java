package com.company.tasks.service;

import com.company.tasks.domain.Task;

public interface TaskService {
    Iterable<Task> list();
    Task save(Task task);
}

package com.stefanbanu.tasks.repository;

import com.stefanbanu.tasks.model.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {


}

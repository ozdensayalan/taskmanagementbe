package edu.sabanciuniv.taskmanagementproject.service;

import edu.sabanciuniv.taskmanagementproject.model.Task;
import edu.sabanciuniv.taskmanagementproject.model.TaskStatus;
import edu.sabanciuniv.taskmanagementproject.repository.TaskRepository;
import edu.sabanciuniv.taskmanagementproject.repository.TaskStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskStatusService {

    @Autowired
    private TaskStatusRepository taskStatusRepository ;
    public TaskStatus addNewTask(TaskStatus task){
        return taskStatusRepository.save(task);
    }

    public List<TaskStatus> getAllTasks() {
        return taskStatusRepository.findAll();
    }
}

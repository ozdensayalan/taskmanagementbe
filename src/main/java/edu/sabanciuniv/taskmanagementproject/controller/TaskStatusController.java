package edu.sabanciuniv.taskmanagementproject.controller;

import edu.sabanciuniv.taskmanagementproject.model.Task;
import edu.sabanciuniv.taskmanagementproject.model.TaskStatus;
import edu.sabanciuniv.taskmanagementproject.service.TaskService;
import edu.sabanciuniv.taskmanagementproject.service.TaskStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:8081/")
public class TaskStatusController {

    @Autowired
    private TaskStatusService taskService;

    @GetMapping("/taskStatus")
    public List<TaskStatus> getAllTasks(){
        return taskService.getAllTasks();
    }
}

package edu.sabanciuniv.taskmanagementproject.controller;

import edu.sabanciuniv.taskmanagementproject.model.Employee;
import edu.sabanciuniv.taskmanagementproject.model.EmployeeTasks;
import edu.sabanciuniv.taskmanagementproject.model.Task;
import edu.sabanciuniv.taskmanagementproject.model.TaskStatus;
import edu.sabanciuniv.taskmanagementproject.service.EmployeeService;
import edu.sabanciuniv.taskmanagementproject.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:8081/")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping("/tasks")
    public Task addTask(@RequestBody Task task){
        return taskService.addNewTask(task);
    }

    @GetMapping("/tasks")
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    @GetMapping("/taskById")
    public List<EmployeeTasks> findTasksById(@RequestParam int id) {
        return taskService.findTasksById(id);
    }

    @GetMapping("/myTasks")
    public List<Task> findMyTasks(@RequestParam int id) {
        return taskService.findMyTasks(id);
    }

    @DeleteMapping("/deleteTask")
    public void deleteEmployee(@RequestParam Integer id) {
        taskService.deleteEmployee(id);
    }
/*
    @GetMapping("/validateUser")
    public Employee validateUser(@RequestParam String userName, @RequestParam String password) {
        return employeeService.validateLogin(userName,password);
    }*/
}

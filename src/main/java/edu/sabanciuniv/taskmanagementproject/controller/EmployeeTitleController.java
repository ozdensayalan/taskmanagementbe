package edu.sabanciuniv.taskmanagementproject.controller;

import edu.sabanciuniv.taskmanagementproject.model.EmployeeTitle;
import edu.sabanciuniv.taskmanagementproject.model.Task;
import edu.sabanciuniv.taskmanagementproject.service.EmployeeService;
import edu.sabanciuniv.taskmanagementproject.service.EmployeeTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:8081/")
public class EmployeeTitleController {

    @Autowired
    private EmployeeTitleService employeeTitleService;

    @GetMapping("/titles")
    public List<EmployeeTitle> getAllTitle(){
        return employeeTitleService.getAllTitle();
    }
}

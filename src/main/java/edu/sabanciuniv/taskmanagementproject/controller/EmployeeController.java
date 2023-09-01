package edu.sabanciuniv.taskmanagementproject.controller;

import edu.sabanciuniv.taskmanagementproject.model.Employee;
import edu.sabanciuniv.taskmanagementproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:8081/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addNewEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getAllBooks(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/validateUser")
    public Employee validateUser(@RequestParam String userName, @RequestParam String password) {
        return employeeService.validateLogin(userName, password);
    }

    @DeleteMapping("/deleteUser")
    public void deleteEmployee(@RequestParam Integer id) {
        employeeService.deleteEmployee(id);
        }
    }

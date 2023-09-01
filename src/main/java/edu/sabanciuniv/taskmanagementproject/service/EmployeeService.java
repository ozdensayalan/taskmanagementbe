package edu.sabanciuniv.taskmanagementproject.service;

import edu.sabanciuniv.taskmanagementproject.model.Employee;
import edu.sabanciuniv.taskmanagementproject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository ;
    public Employee addNewEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee validateLogin(String userName,String password) {
        Employee employee = employeeRepository.findUserByPassword(userName,password);
            return employee;
    }

    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }
}

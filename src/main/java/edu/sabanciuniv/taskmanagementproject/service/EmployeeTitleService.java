package edu.sabanciuniv.taskmanagementproject.service;

import edu.sabanciuniv.taskmanagementproject.model.EmployeeTitle;
import edu.sabanciuniv.taskmanagementproject.model.TaskStatus;
import edu.sabanciuniv.taskmanagementproject.repository.EmployeeRepository;
import edu.sabanciuniv.taskmanagementproject.repository.EmployeeTitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeTitleService {

    @Autowired
    private EmployeeTitleRepository employeeTitleRepository ;

    public List<EmployeeTitle> getAllTitle() {
        return employeeTitleRepository.findAll();
    }
}

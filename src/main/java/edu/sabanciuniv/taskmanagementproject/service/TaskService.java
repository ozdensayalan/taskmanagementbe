package edu.sabanciuniv.taskmanagementproject.service;

import edu.sabanciuniv.taskmanagementproject.model.Employee;
import edu.sabanciuniv.taskmanagementproject.model.EmployeeTasks;
import edu.sabanciuniv.taskmanagementproject.model.Task;
import edu.sabanciuniv.taskmanagementproject.repository.EmployeeRepository;
import edu.sabanciuniv.taskmanagementproject.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository ;
    public Task addNewTask(Task task){
        return taskRepository.save(task);
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public List<EmployeeTasks> findTasksById(int id) {
        List<Object[]> tasks = taskRepository.findTasksById();

        List<EmployeeTasks> result = new ArrayList<>();
        for (Object[] row : tasks) {
            EmployeeTasks employeeTasks = new EmployeeTasks();
            // Dönüşümü elle yapmak için burada sırayla verileri set edebilirsiniz
            employeeTasks.setId((int) row[0]);
            employeeTasks.setTitle((String) row[1]);
            employeeTasks.setInfo((String) row[2]);
            employeeTasks.setStatus((String) row[3]);
            employeeTasks.setAssign((String) row[4]);
            employeeTasks.setDueDate((String) row[5]);
            employeeTasks.setReport((String) row[6]);
            // Diğer alanları da set edin
            result.add(employeeTasks);

        }
        return result;
    }

    public List<Task> findMyTasks(int id) {
        List<Task> tasks = taskRepository.findMyTasks(id);
        return tasks;
    }
    public void deleteEmployee(Integer id) {
        taskRepository.deleteById(id);
    }
/*
    public Employee validateLogin(String userName,String password) {
        Employee employee = taskRepository.findUserByPassword(userName,password);
        return employee;
    }*/
}

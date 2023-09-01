package edu.sabanciuniv.taskmanagementproject.repository;

import edu.sabanciuniv.taskmanagementproject.model.Employee;
import edu.sabanciuniv.taskmanagementproject.model.EmployeeTasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    @Query("select cc from Employee cc where cc.userName =:userName and cc.password=:password")
    Employee findUserByPassword(String userName,String password);
}
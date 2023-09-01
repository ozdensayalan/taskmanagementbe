package edu.sabanciuniv.taskmanagementproject.repository;

import edu.sabanciuniv.taskmanagementproject.model.EmployeeTitle;
import edu.sabanciuniv.taskmanagementproject.model.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeTitleRepository extends JpaRepository<EmployeeTitle,Integer> {
}

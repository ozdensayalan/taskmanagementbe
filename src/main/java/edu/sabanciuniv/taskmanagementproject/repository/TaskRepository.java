package edu.sabanciuniv.taskmanagementproject.repository;

import edu.sabanciuniv.taskmanagementproject.model.Employee;
import edu.sabanciuniv.taskmanagementproject.model.EmployeeTasks;
import edu.sabanciuniv.taskmanagementproject.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task,Integer> {

    @Query("select t.id,t.title,t.info,ts.status,e.name as assing,DATE_FORMAT(t.dueDate, '%d-%m-%Y') as dueDate, " +
            "case when DATE_FORMAT(t.dueDate, '%d-%m-%Y')<=current_date() and t.status<>5 then 'ongoing' when DATE_FORMAT(t.dueDate, '%d-%m-%Y')>current_date() and t.status<>5 then 'overdue' else 'completed' end as report " +
            "from Task t,Employee e, TaskStatus ts" +
            " where t.assign=e.id and ts.id=t.status")
    List<Object[]> findTasksById();


    @Query("select cc from Task cc where cc.assign =:id")
    List<Task> findMyTasks(int id);
}

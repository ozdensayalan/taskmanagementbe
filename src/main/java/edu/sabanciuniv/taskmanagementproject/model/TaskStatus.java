package edu.sabanciuniv.taskmanagementproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TaskStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String status;
    public void setId(int id) {
        this.id = id;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }
    public TaskStatus(int id, String status) {
        this.id = id;
        this.status = status;
    }

    public TaskStatus() {
    }
}

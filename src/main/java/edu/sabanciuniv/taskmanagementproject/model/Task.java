package edu.sabanciuniv.taskmanagementproject.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String info;
    private int status;
    private int assign;
    private Date dueDate;

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setAssign(int assign) {
        this.assign = assign;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    public int getStatus() {
        return status;
    }

    public int getAssign() {
        return assign;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public Task(int id, String title, String info, int status, int assign, Date dueDate) {
        this.id = id;
        this.title = title;
        this.info = info;
        this.status = status;
        this.assign = assign;
        this.dueDate = dueDate;
    }

    public Task() {
    }
}

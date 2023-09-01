package edu.sabanciuniv.taskmanagementproject.model;

import java.util.Date;

public class EmployeeTasks {

    private int id;
    private String title;
    private String info;
    private String status;
    private String assign;
    private String dueDate;
    private String report;
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    public String getStatus() {
        return status;
    }

    public String getAssign() {
        return assign;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getReport() {
        return report;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAssign(String assign) {
        this.assign = assign;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void setReport(String report) {
        this.report = report;
    }
}

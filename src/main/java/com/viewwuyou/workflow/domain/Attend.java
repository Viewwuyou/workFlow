package com.viewwuyou.workflow.domain;

import java.io.Serializable;

public class Attend implements Serializable {
    private static final long serialVersionUID = 48L;

    private Integer id;
    private String dutyDay;
    private AttendType type;
    private Employee employee;

    public Attend() {
    }

    public Attend(Integer id, String dutyDay, AttendType type, Employee employee) {
        this.id = id;
        this.dutyDay = dutyDay;
        this.type = type;
        this.employee = employee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDutyDay() {
        return dutyDay;
    }

    public void setDutyDay(String dutyDay) {
        this.dutyDay = dutyDay;
    }

    public AttendType getType() {
        return type;
    }

    public void setType(AttendType type) {
        this.type = type;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}

package com.viewwuyou.workflow.domain;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.Date;

@Alias("attend")
public class Attend implements Serializable {
    private static final long serialVersionUID = 48L;

    private Integer id;
    private String dutyDay;
    private boolean isCome;
    private Date punchTime;
    private AttendType type;
    private Employee employee;

    public Attend() {
    }

    public Attend(Integer id, String dutyDay, AttendType type, Employee employee, boolean isCome, Date punchTime) {
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

    public boolean isCome() {
        return isCome;
    }

    public void setCome(boolean come) {
        isCome = come;
    }

    public Date getPunchTime() {
        return punchTime;
    }

    public void setPunchTime(Date punchTime) {
        this.punchTime = punchTime;
    }
}

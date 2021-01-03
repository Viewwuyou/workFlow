package com.viewwuyou.workflow.domain;

import java.io.Serializable;

public class Payment implements Serializable {
    private static final long serialVersionUID = 48L;

    private Integer id;
    private String payMonth;
    private Employee employee;

    public Payment(Integer id, String payMonth, Employee employee) {
        this.id = id;
        this.payMonth = payMonth;
        this.employee = employee;
    }

    public Payment() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPayMonth() {
        return payMonth;
    }

    public void setPayMonth(String payMonth) {
        this.payMonth = payMonth;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}

package com.viewwuyou.workflow.domain;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Alias("payment")
public class Payment implements Serializable {
    private static final long serialVersionUID = 48L;

    private Integer id;
    private String payMonth;
    private double payAmount;
    private Employee employee;

    public Payment(Integer id, String payMonth, Employee employee, double payAmount) {
        this.id = id;
        this.payMonth = payMonth;
        this.employee = employee;
        this.payAmount = payAmount;
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

    public double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(double payAmount) {
        this.payAmount = payAmount;
    }
}

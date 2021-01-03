package com.viewwuyou.workflow.domain;

import java.io.Serializable;
import java.util.List;


/**
 * Employee类，定义该类是Manager类的父类，同时又是和Manager类有多对一的关系。
 */
public class Employee implements Serializable {
    private static final long serialVersionUID = 48L;

    private Integer id;
    private String name;
    private Manager manager;
    private List<Attend> attends;
    private List<Payment> payments;

    public Employee() {
    }

    public Employee(Integer id, String name, Manager manager, List<Attend> attends, List<Payment> payments) {
        this.id = id;
        this.name = name;
        this.manager = manager;
        this.attends = attends;
        this.payments = payments;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void setAttends(List<Attend> attends) {
        this.attends = attends;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Manager getManager() {
        return manager;
    }

    public List<Attend> getAttends() {
        return attends;
    }

    public List<Payment> getPayments() {
        return payments;
    }


}

package com.viewwuyou.workflow.domain;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.List;

@Alias("manager")
public class Manager extends Employee implements Serializable {
    private static final long serialVersionUID = 48L;

    private String dept;
    private List<Employee> employees;
    private List<CheckBack> checks;

    public Manager() {
    }

    public Manager(Integer id, String pass, double salary, String name, Manager manager, List<Attend> attends, List<Payment> payments, String dept) {
        super(id, pass, salary, name, manager, attends, payments);
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<CheckBack> getChecks() {
        return checks;
    }

    public void setChecks(List<CheckBack> checks) {
        this.checks = checks;
    }
}

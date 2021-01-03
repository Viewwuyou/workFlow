package com.viewwuyou.workflow.domain;

import java.io.Serializable;
import java.util.List;

public class Manager extends Employee implements Serializable {
    private static final long serialVersionUID = 48L;

    private String dept;
    private List<Employee> employees;
    private List<CheckBack> checks;

    public Manager() {
    }

    public Manager(String dept, List<Employee> employees, List<CheckBack> checks) {
        this.dept = dept;
        this.employees = employees;
        this.checks = checks;
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

package com.viewwuyou.workflow.dao;

import com.viewwuyou.workflow.domain.Employee;

import java.util.List;

public interface EmployeeMapper {
    Integer save(Employee employee);

    Integer update(Employee employee);

    Integer delete(Employee employee);

    Employee get(Integer id);

    List<Employee> findAll();

    List<Employee> findByNameAndPass(Employee employee);

    Employee findByName(String name);
}

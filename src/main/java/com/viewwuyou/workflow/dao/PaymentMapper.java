package com.viewwuyou.workflow.dao;

import com.viewwuyou.workflow.domain.Employee;
import com.viewwuyou.workflow.domain.Payment;

import java.util.List;

public interface PaymentMapper {
    Integer save(Payment payment);

    List<Payment> findByEmp(Employee employee);

    Payment findByMonthAndEmp(String payMonth, Employee employee);
}

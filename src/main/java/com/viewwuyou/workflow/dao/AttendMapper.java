package com.viewwuyou.workflow.dao;

import com.viewwuyou.workflow.domain.Attend;
import com.viewwuyou.workflow.domain.AttendType;
import com.viewwuyou.workflow.domain.Employee;

import java.util.List;

public interface AttendMapper {

    Integer save(Attend attend);

    Integer update(Attend attend);

    Attend get(Integer id);

    Integer delete(Integer id);

    List<Attend> findByEmpId(Integer id);

    List<Attend> findByEmpAndMonth(Employee employee, String month);

    List<Attend> findByEmpAndDutyDay(Employee employee, String dutyDay);

    List<Attend> findByEmpAndDutyDayAndCome(Employee employee, String dutyDay, boolean isCome);

    List<Attend> findByEmpUnAttend(Employee employee, AttendType type);
}
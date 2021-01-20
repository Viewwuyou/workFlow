package com.viewwuyou.workflow.controller;

import com.viewwuyou.workflow.dao.EmployeeMapper;
import com.viewwuyou.workflow.domain.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class mybatisTestController {
    @Resource
    private EmployeeMapper employeeMapper;

    @RequestMapping("/mybatis")
    @ResponseBody
    public String employee() {
        Employee employee = employeeMapper.get(1);
        return employee.getName() + employee.getPass();
    }

}

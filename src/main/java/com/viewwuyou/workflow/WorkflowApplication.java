package com.viewwuyou.workflow;

import com.viewwuyou.workflow.dao.EmployeeMapper;
import com.viewwuyou.workflow.domain.Employee;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@MapperScan("com.viewwuyou.workflow.dao")
@SpringBootApplication
public class WorkflowApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkflowApplication.class, args);
    }
}

package com.viewwuyou.workflow.dao;

import com.viewwuyou.workflow.domain.Manager;

import java.util.List;

public interface ManagerMapper {
    List<Manager> findByNameAndPass(Manager mgr);

    Manager findByName(String name);
}

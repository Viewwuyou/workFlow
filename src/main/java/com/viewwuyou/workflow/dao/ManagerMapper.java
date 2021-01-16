package com.viewwuyou.workflow.dao;

import com.viewwuyou.workflow.domain.Manager;

import java.util.List;

public interface ManagerMapper {
    Integer save(Manager manager);

    Integer update(Manager manger);

    Integer delete(Integer id);

    Manager get(Integer id);

    List<Manager> findByNameAndPass(Manager mgr);

    Manager findByName(String name);
}

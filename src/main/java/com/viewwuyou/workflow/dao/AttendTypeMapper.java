package com.viewwuyou.workflow.dao;

import com.viewwuyou.workflow.domain.AttendType;

import java.util.List;

/**
 * 考勤类型应该是固定的，不应该提供修改的接口
 */
public interface AttendTypeMapper {
    AttendType get(Integer id);

    List<AttendType> findAll();
}

package com.viewwuyou.workflow.dao;

import com.viewwuyou.workflow.domain.Application;
import com.viewwuyou.workflow.domain.Employee;

import java.util.List;

/**
 * 一个dao类常常包含一组curd方法和业务方法
 */
public interface ApplicationMapper {

    /**
     * 保存申请
     * @param application 要保存的对象
     * @return 返回保存对象的id
     */
    Integer save(Application application);

    /**
     * 更新申请
     * @param application 要保存的对象，也就是更新覆盖的对象
     * @return 返回受影响的数量
     */
    Integer update(Application application);

    /**
     * 根据id获取对象
     * @param id 对象id
     * @return 返回获取的对象
     */
    Application get(Integer id);

    /**
     * 根据Employee对象寻找符合条件的Application
     * @param employee 需要查询的员工
     * @return 该员工查询到的申请。
     */
    List<Application> findByEmp(Employee employee);

    /**
     * 根据id删除对象
     * @param id 要删除对象的id
     * @return 返回受影响的数量
     */
    Integer delete(Integer id);

}

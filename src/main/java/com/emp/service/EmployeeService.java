package com.emp.service;

import com.emp.pojo.Employee;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by ZERO_LIKE on 2020/7/1 1:27
 */
@Validated
public interface EmployeeService {


    /*根据ID获取员工信息*/
    Employee getEmployee(Long id);

    /*获取所有员工信息*/
    List<Employee> getAll();

    void add(@Valid Employee employee);

    void update(@Valid Employee employee);

    void delete(Long eid);
}

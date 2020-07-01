package com.emp.dao;

import com.emp.pojo.Employee;

import java.util.List;

public interface EmployeeDao {

    Employee getEmployee(Long id);

    List<Employee> getAll();

    void add(Employee employee);

    void update(Employee employee);

    void delete(Long eid);
}

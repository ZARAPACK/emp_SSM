package com.emp.service.Impl;

import com.emp.dao.EmployeeDao;
import com.emp.pojo.Employee;
import com.emp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ZERO_LIKE on 2020/7/1 1:27
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao ed;

    @Override
    public Employee getEmployee(Long id) {
        return ed.getEmployee(id);
    }

    @Override
    public List<Employee> getAll() {
        return ed.getAll();
    }

    @Override
    public void add(Employee employee) {
        ed.add(employee);
    }

    @Override
    public void update(Employee employee) {
        ed.update(employee);
    }

    @Override
    public void delete(Long eid) {
        ed.delete(eid);
    }
}

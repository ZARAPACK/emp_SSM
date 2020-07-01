package com.emp.controller;

import com.emp.pojo.Employee;
import com.emp.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@Slf4j
@Validated
public class EmployeeController {

    @Autowired
    private EmployeeService es;


    // 获取所有员工信息
    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public String getAllEmployee(Model model){
        List<Employee> esAll = es.getAll();
        model.addAttribute("AllEmp",esAll);
        for (Employee e:esAll) {
            System.out.println(e.toString());
        }
        return "employee/allEmployees";
    }

    // 跳转到添加员工页面(get请求)
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(@ModelAttribute("employee") Employee employee) {
        return "employee/add";
    }

    // 具体的添加用户处理方法(post请求)
    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public String add(@Validated Employee employee, BindingResult br){
        if (br.hasErrors()) {
            return "employee/add"; // 如果有错误, 则直接跳转到add添加用户页面
        }
        //添加用户信息的api
        es.add(employee);
        return "redirect:/employees"; // 重定向到用户列表页面
    }


    // 跳转到修改用户信息页面
    @RequestMapping(value="/employee/{eid}", method=RequestMethod.GET)
    public String update(@PathVariable Long eid, Model model) {
        Employee employee = es.getEmployee(eid);
        model.addAttribute("UpdateEmp",employee);
        return "employee/update";
    }

    // 具体的修改用户处理方法(post请求)
    @RequestMapping(value="/employee", method=RequestMethod.PUT)
    public String update(@Validated Employee employee, BindingResult br) {
        if(br.hasErrors()) {
            return "employee/update"; //如果有错误, 则直接跳转到update修改用户页面
        }
        es.update(employee);
        return "redirect:/employees";
    }

    // 删除用户信息
    @RequestMapping(value="/employee/{eid}",method=RequestMethod.DELETE)
    public String delete(@PathVariable Long eid) {
        es.delete(eid);
        return "redirect:/employees";
    }


}

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


    // ��ȡ����Ա����Ϣ
    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public String getAllEmployee(Model model){
        List<Employee> esAll = es.getAll();
        model.addAttribute("AllEmp",esAll);
        for (Employee e:esAll) {
            System.out.println(e.toString());
        }
        return "employee/allEmployees";
    }

    // ��ת�����Ա��ҳ��(get����)
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(@ModelAttribute("employee") Employee employee) {
        return "employee/add";
    }

    // ���������û�������(post����)
    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public String add(@Validated Employee employee, BindingResult br){
        if (br.hasErrors()) {
            return "employee/add"; // ����д���, ��ֱ����ת��add����û�ҳ��
        }
        //����û���Ϣ��api
        es.add(employee);
        return "redirect:/employees"; // �ض����û��б�ҳ��
    }


    // ��ת���޸��û���Ϣҳ��
    @RequestMapping(value="/employee/{eid}", method=RequestMethod.GET)
    public String update(@PathVariable Long eid, Model model) {
        Employee employee = es.getEmployee(eid);
        model.addAttribute("UpdateEmp",employee);
        return "employee/update";
    }

    // ������޸��û�������(post����)
    @RequestMapping(value="/employee", method=RequestMethod.PUT)
    public String update(@Validated Employee employee, BindingResult br) {
        if(br.hasErrors()) {
            return "employee/update"; //����д���, ��ֱ����ת��update�޸��û�ҳ��
        }
        es.update(employee);
        return "redirect:/employees";
    }

    // ɾ���û���Ϣ
    @RequestMapping(value="/employee/{eid}",method=RequestMethod.DELETE)
    public String delete(@PathVariable Long eid) {
        es.delete(eid);
        return "redirect:/employees";
    }


}

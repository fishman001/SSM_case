package xyz.fishman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.fishman.bean.Employee;
import xyz.fishman.service.EmployeeService;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @ResponseBody
    @RequestMapping("emp")
    public List<Employee> findAll() {
        List<Employee> employees = employeeService.findAll();
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        return employees;
    }
}

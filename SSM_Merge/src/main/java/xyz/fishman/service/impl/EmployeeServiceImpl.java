package xyz.fishman.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.fishman.bean.Employee;
import xyz.fishman.dao.EmployeeDao;
import xyz.fishman.service.EmployeeService;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }
}

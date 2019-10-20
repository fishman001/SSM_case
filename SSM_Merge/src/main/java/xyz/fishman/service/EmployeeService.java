package xyz.fishman.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.fishman.bean.Employee;
import xyz.fishman.dao.EmployeeDao;

import java.util.List;


public interface EmployeeService {

    List<Employee> findAll();
}

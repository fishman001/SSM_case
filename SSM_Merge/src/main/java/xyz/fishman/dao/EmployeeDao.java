package xyz.fishman.dao;

import org.springframework.stereotype.Repository;
import xyz.fishman.bean.Employee;

import java.util.List;

@Repository
public interface EmployeeDao {

    List<Employee> findAll();

}

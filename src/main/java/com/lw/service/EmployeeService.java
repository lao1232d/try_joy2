package com.lw.service;

import com.lw.pojo.Employee;
import org.springframework.stereotype.Service;


import javax.validation.Valid;
import java.util.List;
@Service
public interface EmployeeService {

    //add
    int add(Employee employee);

    //delete
    int deleteEmployeeById(int eid);

    //update
    int updateEmployee(Employee employee);

    //select
    List<Employee> queryAll();

}

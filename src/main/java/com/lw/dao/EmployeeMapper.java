package com.lw.dao;

import com.lw.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {

    //add
    int add(Employee employee);

    //delete
    int deleteEmployeeById(int eid);

    //update
    int updateEmployee(Employee employee);

    //select
    List<Employee> queryAll();


}

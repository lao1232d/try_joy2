package com.lw.service;

import com.lw.dao.EmployeeMapper;
import com.lw.pojo.Employee;


import java.util.List;
public class EmployeeServiceImpl implements EmployeeService{


    private EmployeeMapper employeeMapper;

    public void setEmployeeMapper(EmployeeMapper employeeMapper){
        this.employeeMapper = employeeMapper;
    }

    @Override
    public int add(Employee employee) {
        return employeeMapper.add(employee);
    }

    @Override
    public int deleteEmployeeById(int eid) {
        return employeeMapper.deleteEmployeeById(eid);
    }

    @Override
    public int updateEmployee(Employee employee) {
        return employeeMapper.updateEmployee(employee);
    }

    @Override
    public List<Employee> queryAll() {
        return employeeMapper.queryAll();
    }
}

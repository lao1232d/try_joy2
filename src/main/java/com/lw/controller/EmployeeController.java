package com.lw.controller;

import com.alibaba.fastjson.JSON;
import com.lw.pojo.Employee;
import com.lw.service.EmployeeService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/listAll")
    public String listAll(Model model){
        List<Employee> employees = employeeService.queryAll();
        String emp_json = JSON.toJSONString(employees);
        System.out.println("一共有employees = "+emp_json);
        model.addAttribute("emp_json",emp_json);
        String ti = "展示";
        model.addAttribute("ti",ti);
        return "/list";
    }

    @RequestMapping("/deleteOne")
    public String deleteOne(Model model){
        //删除第id为1的成员
        int i = employeeService.deleteEmployeeById(1);
        List<Employee> employees = employeeService.queryAll();
        String emp_json = JSON.toJSONString(employees);
        System.out.println("删除了后有 = "+emp_json);
        model.addAttribute("emp_json",emp_json);
        String ti = "删除";
        model.addAttribute("ti",ti);
        return "/list";
    }




    @RequestMapping("/updateOne")
    public String updateOne(Model model, @Valid Employee employee2, BindingResult bindingResult){

        if (bindingResult.hasErrors()) {
            System.out.println("参数不正确, employee={}"+employee2);
            return null;
        }

        //更新第id为2的成员的信息
//        Employee employee2 = new Employee();
//        employee2.setEid(3);
//        employee2.setEname("ak");
//        employee2.setAddress("广州");
//        employee2.setAge(66);
//        employee2.setSex("男");

        employeeService.updateEmployee(employee2);
        List<Employee> employees = employeeService.queryAll();
        String emp_json = JSON.toJSONString(employees);
        System.out.println("修改了后有 = "+emp_json);
        model.addAttribute("emp_json",emp_json);
        String ti = "修改";
        model.addAttribute("ti",ti);
        return "/list";
    }

    @RequestMapping("/addOne")
    public String insertOne(Model model, @Valid Employee employee, BindingResult bindingResult){

        if (bindingResult.hasErrors()) {
            System.out.println("参数不正确, employee={}"+employee);
            return null;
        }


//        Employee employee = new Employee("小红","女",22,"云南");
        int i = employeeService.add(employee);
        List<Employee> employees = employeeService.queryAll();
        String emp_json = JSON.toJSONString(employees);
        System.out.println("一共有employees = "+emp_json);
        model.addAttribute("emp_json",emp_json);
        String ti = "增加";
        model.addAttribute("ti",ti);
        return "/list";
    }

}

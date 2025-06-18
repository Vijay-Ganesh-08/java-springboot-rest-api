package org.training.springbootrestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.*;
import org.training.springbootrestapi.model.Employee;
import org.training.springbootrestapi.repository.EmployeeRepo;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeRepo employeeRepo;

    @GetMapping("getEmployees")
    @ResponseBody
    public List<Employee> getAliens() {
        List<Employee> list =  employeeRepo.findAll();
        return list;
    }

    @GetMapping("getEmployee")
    @ResponseBody
    public Employee getEmployees(@RequestParam int eid) {
        Employee employee = employeeRepo.findById(eid).orElse(new Employee(0,"",""));
        return employee;
    }

    @GetMapping("getEmployee/{eid}")
    @ResponseBody
    public Employee getEmployee(@PathVariable("eid") int eid) {
        return employeeRepo.findById(eid).orElse(new Employee(0,"",""));
    }
}

package org.training.springbootrestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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


}

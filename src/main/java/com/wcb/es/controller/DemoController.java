package com.wcb.es.controller;

import com.wcb.es.Util.Result;
import com.wcb.es.pojo.Employee;
import com.wcb.es.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController /* @Controller + @ResponseBody*/
public class DemoController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmp")
    public Result<String> addEmployee(@RequestBody Employee employee) {
        String result = employeeService.add(employee);
        return new Result<String>(0, "OK", result);
    }
}

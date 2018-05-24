package com.wcb.es.service;

import com.wcb.es.dao.EmployeeDao;
import com.wcb.es.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    public String add(Employee employee) {
        employeeDao.save(employee);
        return "success";
    }
}

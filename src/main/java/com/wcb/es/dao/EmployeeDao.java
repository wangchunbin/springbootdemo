package com.wcb.es.dao;

import com.wcb.es.pojo.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends ElasticsearchRepository<Employee, Integer> {
}

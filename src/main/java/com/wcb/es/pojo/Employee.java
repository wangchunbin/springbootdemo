package com.wcb.es.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Document(indexName = "index_employee", type = "type_employe")
public class Employee {
    @Id
    private Integer id;
    @Field
    private String name;
    @Field
    private String sex;
    @Field
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date birthDate;
}

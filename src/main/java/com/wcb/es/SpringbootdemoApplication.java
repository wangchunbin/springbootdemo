package com.wcb.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Configuration注解的类上，来获取需要依赖注入的Bean；
 * @ImportResource，来导入xml格式的配置文件；
 * http://www.tianshouzhi.com/api/tutorials/springboot/82
 */
@SpringBootApplication
public class SpringbootdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoApplication.class, args);
    }

}

package com.atguigu.controller;

import com.atguigu.proper.DataSourceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private DataSourceProperties dataSourceProperties;

    public String hello() {
        System.out.println("dataSourceProperties = " + dataSourceProperties);
        return "Hello SpringBoot3!";
    }
}

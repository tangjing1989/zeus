package com.tangjing.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@SpringBootApplication
@MapperScan("com.tangjing.project.dao")
//@ComponentScan("com.tangjing.project.webapi.controller")
public class SampleController extends WebMvcConfigurerAdapter {


    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }

}

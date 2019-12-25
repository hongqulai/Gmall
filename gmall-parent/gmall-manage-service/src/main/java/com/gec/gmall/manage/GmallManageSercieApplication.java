package com.gec.gmall.manage;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDubbo
@MapperScan(basePackages = "com.gec.gmall.manage.mapper")
public class GmallManageSercieApplication {

    public static void main(String[] args) {

        SpringApplication.run(GmallManageSercieApplication.class,args);

    }

}

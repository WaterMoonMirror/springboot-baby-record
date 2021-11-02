package com.wondersgroup.springbootbabyrecord;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

// 扫描 mybatis 通用 mapper 所在的包
@MapperScan(basePackages = "com.wondersgroup.springbootbabyrecord.mapper")
@SpringBootApplication
public class SpringbootBabyRecordApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBabyRecordApplication.class, args);
    }

}

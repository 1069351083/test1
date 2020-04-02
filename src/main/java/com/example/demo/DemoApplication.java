package com.example.demo;

import com.example.demo.usermapper.SysUserMapper;
import com.example.demo.userservice.ISysUserService;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo.usermapper")
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

}

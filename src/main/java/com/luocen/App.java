package com.luocen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan(basePackages= {"com.luocen.mapper"})
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(App.class, args);
		
	}

}

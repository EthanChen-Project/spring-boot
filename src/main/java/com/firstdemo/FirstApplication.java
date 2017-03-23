package com.firstdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 1.springboot 已经启动内嵌的是tomcat 默认的端口是8080
 * 2.@ComponentScan默认扫描当前子包中配置的bean.
 * 3.@SpringBootApplication相当于@Configuration、@EnableAutoConfiguration
 * 4.http://127.0.0.1:8080/index/Ethan,浏览器，做测试。
 * 
 * @author 
 *
 */
@ComponentScan
@SpringBootApplication
public class FirstApplication {
	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}
}

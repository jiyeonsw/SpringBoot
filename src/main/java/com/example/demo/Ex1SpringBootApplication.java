package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}) // 인텔리제이 실행 안될 경우, 괄호 추가
@ComponentScan ({"test.data"}) // 패키지 폴더를 임의로 변경했을 때, 해당 폴더를 인식하라는 의미
public class Ex1SpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ex1SpringBootApplication.class, args);
	}

}

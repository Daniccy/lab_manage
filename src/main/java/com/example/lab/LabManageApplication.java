package com.example.lab;

import com.example.lab.UI.select_equipment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.metrics.ApplicationStartup;

@SpringBootApplication
@ComponentScan("com.example.lab")
public class LabManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabManageApplication.class, args);
		new select_equipment().init();
	}


}

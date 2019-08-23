package com.isut.springboot1;

import com.isut.springboot1.dao.StudentDto;
import com.isut.springboot1.services.DataSetvice;
import com.isut.springboot1.services.IDataService;
import com.isut.springboot1.services.IInformationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBoot1Application.class, args);
		IDataService dataService = applicationContext.getBean(DataSetvice.class);
		IInformationService informationService = applicationContext.getBean(IInformationService.class);

		dataService.addStudent(new StudentDto("Yevhen", "Suturin",
				"Dnipro", "My street", "My state", "0000001"));
		dataService.addStudent(new StudentDto("Oksana", "Suturina",
				"Dnipro", "My street", "My State", "00000002"));

		System.out.println(informationService.getAllStudents());
	}

}

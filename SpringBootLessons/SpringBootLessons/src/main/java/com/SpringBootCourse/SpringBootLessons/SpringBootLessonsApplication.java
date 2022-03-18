package com.SpringBootCourse.SpringBootLessons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootLessonsApplication {

	public static void main(String[] args) {
				ApplicationContext applicationContext=  SpringApplication.run(SpringBootLessonsApplication.class, args);

		for (String bean: applicationContext.getBeanDefinitionNames()
			 ) {
			System.out.println(bean);
		}
	}

}

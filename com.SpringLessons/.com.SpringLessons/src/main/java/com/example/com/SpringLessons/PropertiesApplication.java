package com.example.com.SpringLessons;

import com.example.com.SpringLessons.properties.SomeExternalServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
//app.properties
@PropertySource("classpath:app.properties")
public class PropertiesApplication {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(PropertiesApplication.class);) {

			SomeExternalServices service = applicationContext.getBean(SomeExternalServices.class);


			System.out.println(service.returnServiceURL());






		}
	}

}

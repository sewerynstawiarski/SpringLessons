package com.example.com.SpringLessons;

import com.example.com.SpringLessons.CDI.SomeCDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class CDIApplication {

	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(CDIApplication.class);

	public static void main(String[] args) {

		//ConfigurableApplicationContext applicationContext = SpringApplication.run(CDIApplication.class, args);
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(CDIApplication.class);
		SomeCDIBusiness business = applicationContext.getBean(SomeCDIBusiness.class);


		LOGGER.info("{dao}", business, business.getSomeCDIDAO());


	}

}

package com.example.com.SpringLessons;

import com.example.com.SpringLessons.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class ScopeApplication {

	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(ScopeApplication.class);

	public static void main(String[] args) {

		//ConfigurableApplicationContext applicationContext = SpringApplication.run(ScopeApplication.class, args);
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScopeApplication.class);
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);

		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}", personDAO);

		LOGGER.info("{}", personDAO.getJdbcConnection());

		LOGGER.info("{}", personDAO2);

		LOGGER.info("{}", personDAO2.getJdbcConnection());
	}

}

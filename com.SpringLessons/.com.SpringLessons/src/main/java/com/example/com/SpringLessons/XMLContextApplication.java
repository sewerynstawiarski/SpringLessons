package com.example.com.SpringLessons;

import com.example.com.SpringLessons.CDI.SomeCDIBusiness;
import com.example.com.SpringLessons.XML.XMLPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class XMLContextApplication {

	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(XMLContextApplication.class);

	public static void main(String[] args) {


		try(
				ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml"))
		{
			XMLPersonDAO xmlPersonDAO = applicationContext.getBean(XMLPersonDAO.class);
			LOGGER.info("Loeaded beans ->{}", (Object) applicationContext.getBeanDefinitionNames());


			LOGGER.info("{}", xmlPersonDAO.getXMLJdbcConnection());
			System.out.println(xmlPersonDAO.getXMLJdbcConnection());
		}


	}

}

package com.SpringLessons.JDBC.JA;

import com.SpringLessons.JDBC.JA.entity.Person;
import com.SpringLessons.JDBC.JA.jdbc.PersonJdbcDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

//@SpringBootApplication
public class SpringJDBCDatabaseApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDAO personJdbcDAO;

	public static void main(String[] args) {
		SpringApplication.run(SpringJDBCDatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("All users: {}",personJdbcDAO.findAll());
		logger.info("User ID 10001: {}",personJdbcDAO.findByObjectId(10001));
		logger.info("User Joseph: {}",personJdbcDAO.findByName("Joseph"));
		logger.info("User in Washington: {}",personJdbcDAO.findByLocation("Washington"));
		logger.info("Deleting user 10004 -> number of rows deleted: {}",personJdbcDAO.deleteByID(10004));
		logger.info("Deleting user 10005 -> number of rows deleted: {}",personJdbcDAO.deleteByName("Thomas"));
		logger.info("Inserting 10006 = {}", personJdbcDAO.insert(new Person(10006,"Bolek", "Warszawa", new Date())));
		logger.info("Updating 10005: {}",personJdbcDAO.update(new Person (10005,"Seweryn", "Tokio", new Date())));
	}
}

package com.SpringLessons.JDBC.JA;

import com.SpringLessons.JDBC.JA.SpringData.PersonSpringDataRepository;
import com.SpringLessons.JDBC.JA.entity.Person;
import com.SpringLessons.JDBC.JA.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

//@SpringBootApplication
public class SpringDataDatabaseApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonSpringDataRepository personJpaRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataDatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("User id 10001: {}",personJpaRepository.findById(10001));
		logger.info("Inserting = {}", personJpaRepository.save(new Person("Bolek", "Warszawa", new Date())));
		logger.info("Updating 10005: {}",personJpaRepository.save(new Person (10005,"Seweryn", "Tokio", new Date())));
		//logger.info("User Joseph: {}",personJpaRepository.findByName("Joseph"));
		personJpaRepository.deleteById(10004); // cannot use logger because it's void method
		logger.info("All users: {}", personJpaRepository.findAll());
		/*logger.info("User ID 10001: {}",personJdbcDAO.findByObjectId(10001));
		logger.info("User in Washington: {}",personJdbcDAO.findByLocation("Washington"));
		logger.info("Deleting user 10005 -> number of rows deleted: {}",personJdbcDAO.deleteByName("Thomas"));


		 */
	}
}

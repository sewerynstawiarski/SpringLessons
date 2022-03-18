package componentscan;

import com.example.com.SpringLessons.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class ComponentScanApplication {

	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(ComponentScanApplication.class);

	public static void main(String[] args) {

		//ConfigurableApplicationContext applicationContext = SpringApplication.run(ComponentScanApplication.class, args);
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ComponentScanApplication.class);
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}", componentDAO);


	}
}

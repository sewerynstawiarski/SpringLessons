package com.example.com.SpringLessons;

import com.example.com.SpringLessons.basic.SomecdiBussiness;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BasicApplication {

	public static void main(String[] args) {

		//What are the beans?
		//What are the dependencies of the bean?
		//Where to look for the bean?




		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm()); //com.example.com.SpringLessons.basic.BubbleSortAlgorithm@b4c966a 3 or com.example.com.SpringLessons.basic.QuickSortAlgorithm@b4c966a 3

		
		// Application Context
		

		//System.out.println(result);
		//ConfigurableApplicationContext applicationContext = SpringApplication.run(BasicApplication.class, args);
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BasicApplication.class)) {

			SomecdiBussiness binarySearch = applicationContext.getBean(SomecdiBussiness.class);

			SomecdiBussiness binarySearch1 = applicationContext.getBean(SomecdiBussiness.class);

			System.out.println(binarySearch);
			System.out.println(binarySearch1);

			int result = binarySearch.binarySearch(new int[]{1, 3, 5, 4}, 3);

			System.out.println(result);
			//applicationContext.close(); or try and catch
		}
	}

}

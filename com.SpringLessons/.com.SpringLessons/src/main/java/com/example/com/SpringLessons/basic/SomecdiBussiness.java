package com.example.com.SpringLessons.basic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
//@Scope("prototype")
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Service
public class SomecdiBussiness {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    @Qualifier("Quick")
    private SortAlgorithm sortAlgorithm; // tak też jest poprawnie(w miarę)
    // setter injection
    /*public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

     */
    // constructor injection
        /*public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }

     */

    public int binarySearch(int[] numbers, int numberToSearch) {
        // implementing sorting logic
        //Bubble sort Algorithm

        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        return 3;
    }

    @PostConstruct
    public void postConstruct() {
        logger.info("postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("preDestroy");
    }
}





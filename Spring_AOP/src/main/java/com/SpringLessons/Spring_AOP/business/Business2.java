package com.SpringLessons.Spring_AOP.business;

import com.SpringLessons.Spring_AOP.data.Dao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {
    @Autowired
    private Dao2 dao2;

    public String calculateSomething() {
        // here should be some business logic, things to do with the data
        return dao2.retrieveSomething();
    }
}

package com.SpringLessons.Spring_AOP.business;

import com.SpringLessons.Spring_AOP.aspect.TrackTime;
import com.SpringLessons.Spring_AOP.data.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {
    @Autowired
    private Dao1 dao1;
    @TrackTime
    public String calculateSomething() {
        // here should be some business logic, things to do with the data
        return dao1.retrieveSomething();
    }
}

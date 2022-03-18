package com.SpringLessons.Spring_AOP.data;

import com.SpringLessons.Spring_AOP.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {
    @TrackTime
    public String retrieveSomething(){
        return "Dao1";
    }
}

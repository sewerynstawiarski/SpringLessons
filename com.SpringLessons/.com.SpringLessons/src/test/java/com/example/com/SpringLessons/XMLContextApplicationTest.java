package com.example.com.SpringLessons;

import com.example.com.SpringLessons.basic.SomecdiBussiness;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "/ApplicationContext.xml")
class XMLContextApplicationTest {

    @Autowired
    SomecdiBussiness binarySearch;

    @Test
    void XMLBasedTest() {
        //call the method on binary search
        //check if the valuse is correct
        int result = binarySearch.binarySearch(new int[] {1,2,3}, 3);
        assertEquals(3,result);

    }
}
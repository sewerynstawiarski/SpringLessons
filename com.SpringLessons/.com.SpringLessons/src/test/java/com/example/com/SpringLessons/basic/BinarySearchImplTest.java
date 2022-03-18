package com.example.com.SpringLessons.basic;

import com.example.com.SpringLessons.BasicApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

//Load the context
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { BasicApplication.class} )

class BinarySearchImplTest{

    //get the bean from the context
    @Autowired
    SomecdiBussiness binarySearch;

    @Test
    void binarySearchBasicScenario() {
        //call the method on binary search
        //check if the valuse is correct
        int result = binarySearch.binarySearch(new int[] {1,2,3}, 3);
        assertEquals(3,result);
    }
}
package com.example.com.SpringLessons.CDI;

import org.springframework.stereotype.Component;

import javax.inject.Named;

@Named
public class SomeCDIDAO {

    public int[] getData() {
        return new int[] {4,89,45};
    }
}

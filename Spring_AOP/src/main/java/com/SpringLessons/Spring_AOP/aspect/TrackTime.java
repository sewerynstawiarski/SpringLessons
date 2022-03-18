package com.SpringLessons.Spring_AOP.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
//Methods only
//Runtime -  get data while application is being executed
public @interface TrackTime {
}

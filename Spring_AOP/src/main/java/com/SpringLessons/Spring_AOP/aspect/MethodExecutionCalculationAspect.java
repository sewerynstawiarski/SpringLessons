package com.SpringLessons.Spring_AOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@EnableAspectJAutoProxy
@Aspect
@Configuration


public class MethodExecutionCalculationAspect {


    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Around("execution (* com.SpringLessons.Spring_AOP.business.*.*(..))")
    public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {

        //start time =x
        // execution of the method
        //end time = y
        long startTime=  System.currentTimeMillis();
        joinPoint.proceed();
        long endTime = System.currentTimeMillis() - startTime;
        logger.info("Time taken by this {} is {}", joinPoint, endTime);
    }
}

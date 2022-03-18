package com.SpringLessons.Spring_AOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@EnableAspectJAutoProxy
@Aspect
@Configuration


public class AfterAOPAcces {


    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @AfterReturning(
            value = "com.SpringLessons.Spring_AOP.aspect.CommonJoinPointConfig.dataLayerExecution()",
            returning = "result"
    )
    public void afterReturning(JoinPoint joinPoint, Object result) {
        logger.info("{} returned with value {}", joinPoint, result);
    }
    @AfterThrowing(
            value = "execution (* com.SpringLessons.Spring_AOP.business.*.*(..))",
            throwing = "exception"
    )
    public void afterThrowing(JoinPoint joinPoint, Object exception) {
        logger.info("{} returned with exception: {}", joinPoint, exception);
    }
    @After(
            value = "com.SpringLessons.Spring_AOP.aspect.CommonJoinPointConfig.trackTimeAnnotation())"

    )
    public void after(JoinPoint joinPoint) {
        logger.info("after execution of: {}", joinPoint);
    }
}

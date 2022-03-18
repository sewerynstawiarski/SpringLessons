package com.SpringLessons.Spring_AOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//AOP
@EnableAspectJAutoProxy
@Aspect // Pointcut+Advice
@Configuration

//Configuration
public class UserAccesAspect {


    private Logger logger = LoggerFactory.getLogger(this.getClass());
    //What kind of method should be intercepted?
    // execution (* package.*.*(..))
    //Weaver&weaving
    @Before("com.SpringLessons.Spring_AOP.aspect.CommonJoinPointConfig.businessLayerExecution()")
    public void before(JoinPoint joinPoint) {
        //What do I want to do with this interception?
        //Advice
        logger.info("Check for user");
        logger.info("Allow execution {}", joinPoint);
    }
}

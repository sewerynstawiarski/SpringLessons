package com.SpringLessons.Spring_AOP.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
    @Pointcut("execution (* com.SpringLessons.Spring_AOP.business.*.*(..))")
    public void businessLayerExecution() {}
    @Pointcut("execution (* com.SpringLessons.Spring_AOP.data.*.*(..))")
    public void dataLayerExecution() {}
    @Pointcut("com.SpringLessons.Spring_AOP.aspect.CommonJoinPointConfig.businessLayerExecution() && com.SpringLessons.Spring_AOP.aspect.CommonJoinPointConfig.dataLayerExecution()")
    public void allLayerExecution(){}
    @Pointcut("bean(*Dao*)")
    public void beanContainingDao(){}
    @Pointcut("within(com.SpringLessons.Spring_AOP.data..*)")
    public void dataLayeredExecutionWithWithin() {}
    @Pointcut("@annotation(com.SpringLessons.Spring_AOP.aspect.TrackTime)")
    public void trackTimeAnnotation() {}
}

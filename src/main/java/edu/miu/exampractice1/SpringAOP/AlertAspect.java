package edu.miu.exampractice1.SpringAOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AlertAspect{

    @Pointcut("@annotation(edu.miu.exampractice1.SpringAOP.Alert)")
    public void Alerted(){

    }

    @After("Alerted()")
    public void sendAlert(JoinPoint joinPoint){
        System.out.println("The method called is: "+ joinPoint.getSignature().getName());
    }
}

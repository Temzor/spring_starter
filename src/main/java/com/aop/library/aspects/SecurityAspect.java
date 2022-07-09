package com.aop.library.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class SecurityAspect {
    @Before("com.aop.library.aspects.PointcutClass.allAddMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeAddLoggingAdvice: логирование попытки получить книгу/журнал.");
        System.out.println("-----------------------------------------------------");
    }
}

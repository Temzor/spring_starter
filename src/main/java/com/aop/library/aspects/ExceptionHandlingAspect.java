package com.aop.library.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspect {
    @Before("com.aop.library.aspects.PointcutClass.allAddMethods()")
    public void beforeGetExceptionHandlingAdvice() {
        System.out.println("beforeAddExceptionHandlingAdvice: обрабатываем исключения при попытке получить книгу/журнал.");
        System.out.println("-----------------------------------------------------");
    }
}

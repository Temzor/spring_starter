package com.aop.library.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {
    @Pointcut("execution( public * get*())")
    private void allGetMethods() {
    }

    @Before("allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: попытка получить книгу/журнал.");
    }

    @Before("execution( * returnBook())")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: попытка вернуть книгу/журнал");
    }

    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: проверка прав на получения книги/жкрнала.");
    }
}

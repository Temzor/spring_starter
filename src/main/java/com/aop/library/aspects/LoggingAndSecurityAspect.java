package com.aop.library.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* com.aop.library.UniLibrary.get*(..))")
    private void allMethodsFromUniLibrary() {
    }

    @Pointcut("execution(private void com.aop.library.UniLibrary.returnBook())")
    private void returnMagazineFromUnitLibrary() {

    }

    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUnitLibrary()")
    private void allMethodsExceptReturnMagazineFromUniLibrary() {
    }

    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodsExceptReturnMagazineAdvice() {
        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log #10");
    }

}

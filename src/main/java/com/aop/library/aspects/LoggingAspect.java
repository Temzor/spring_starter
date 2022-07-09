package com.aop.library.aspects;

import com.aop.library.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

    @Before("com.aop.library.aspects.PointcutClass.allAddMethods()")
    public void beforeGetSecurityAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature getMethod = " + methodSignature.getMethod());
        System.out.println("methodSignature getReturnType = " + methodSignature.getReturnType());
        System.out.println("methodSignature getName = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object argument : arguments) {
                if (argument instanceof Book) {
                    Book book = (Book) argument;
                    System.out.println("Information for book - "
                    + book.getName() + ", author - " + book.getAuthor()
                    + ", year of publication - " + book.getYearOfPublication());
                } else if (argument instanceof String) {
                    System.out.println("Add book in library: " + argument);
                }
            }
        }


        System.out.println("beforeAddSecurityAdvice: проверка прав на получения книги/журнала.");
        System.out.println("-----------------------------------------------------");
    }
}

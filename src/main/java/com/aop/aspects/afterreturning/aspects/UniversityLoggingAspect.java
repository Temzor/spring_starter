package com.aop.aspects.afterreturning.aspects;

import com.aop.aspects.afterreturning.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получения "
                + "списка студентов перед методом getStudents.");
    }

    @AfterReturning(pointcut = "execution(* getStudents())",
    returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
        Student firstStudent = students.get(0);

        String nameSurname = firstStudent.getNameSurname();
        nameSurname = "Mr. " + nameSurname;
        firstStudent.setNameSurname(nameSurname);

        double avgGrade = firstStudent.getAvgGrade();
        avgGrade += 1;
        firstStudent.setAvgGrade(avgGrade);

        System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получения "
                + "списка студентов после работы метода getStudents.");
    }

    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception" )
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
        System.out.println("afterThrowingGetStudentsLoggingAdvice: логируем вывод исключения " + exception);
    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice: логируем нормальное окончания работы метода или вывод исключения");
    }
}

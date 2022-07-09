package com.aop.library.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class PointcutClass {
    @Pointcut("execution( public * add*(..))")
    public void allAddMethods() {
    }
}

package com.springcore.annotationLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context  = new ClassPathXmlApplicationContext("annotationLifecycleConfig.xml");
        annotationLifecycle annot = (annotationLifecycle) context.getBean("annotation");
        System.out.println(annot);
        context.registerShutdownHook();
     }
}

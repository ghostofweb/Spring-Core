package com.springcore.autowireannotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("autowireAnnotation.xml");
        Emp emp = (Emp) context.getBean("emp");
        System.out.println(emp);
        context.registerShutdownHook();
    }
}

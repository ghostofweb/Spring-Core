package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifeconfig.xml");
        Lifecycle c1 = (Lifecycle) context.getBean("lifecycle");
        System.out.println(c1);
        context.registerShutdownHook();

    }
}

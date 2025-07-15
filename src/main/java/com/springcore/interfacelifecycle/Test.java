package com.springcore.interfacelifecycle;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("interfaceLifecycleConfig.xml");
        MyLifecycle life = (MyLifecycle) context.getBean("interface");
        System.out.println(life);
        context.registerShutdownHook();
    }

}

package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("cconfig.xml");
        Emp emp = (Emp) context.getBean("Emp1");
        System.out.println(emp);
    }
}

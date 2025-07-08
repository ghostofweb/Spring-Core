package com.springcore.addition;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("addconfig.xml");
        Addition adding = (Addition) context.getBean("add");
        adding.doSum();
    }
}

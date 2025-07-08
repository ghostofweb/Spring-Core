package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
{
      ApplicationContext context =  new ClassPathXmlApplicationContext("config.xml");
      Student student = (Student) context.getBean("student1");
        System.out.println(student);
        Student student1 = (Student) context.getBean("student2");
        System.out.println(student1);
        Student student2 = (Student) context.getBean("student3");
        System.out.println(student2);
    }
}

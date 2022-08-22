package com.harshit.main;

import com.harshit.beans.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext context = new ClassPathXmlApplicationContext
                ("springConfig1.xml");
        Vehicle v = (Vehicle)context.getBean("vehicle");
        v.run();
    }
}
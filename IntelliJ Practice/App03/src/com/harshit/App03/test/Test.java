package com.harshit.App03.test;

import com.harshit.App03.beans.EmployeeBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String...args){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("com/harshit/App03/configs/SpringConfig.xml");
        EmployeeBean e = (EmployeeBean) context.getBean("employee");
        System.out.println(e);
    }
}

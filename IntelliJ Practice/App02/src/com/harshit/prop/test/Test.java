package com.harshit.prop.test;

import com.harshit.prop.beans.Wish;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String...args){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/harshit/prop/configs/springconfig.xml");
        Wish w = (Wish)context.getBean("WishBean");
        System.out.println(w.wish());
    }
}

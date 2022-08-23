package com.harshit.prop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.harshit.prop.beans.Welcome;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/harshit/prop/configs/SpringConfig.xml");
		Welcome w = (Welcome)context.getBean("WelcomeBean");
		System.out.println(w.wish());
	}

}

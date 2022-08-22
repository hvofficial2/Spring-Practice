package com.harshit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.harshit.beans.Bean;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\harshit\\configs\\springConfig.xml");
		Bean b1 = (Bean)context.getBean("Bean");
		b1.wish();
	}

}

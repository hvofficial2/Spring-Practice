package com.harshit.App04.test;

import com.harshit.App04.beans.EmployeeBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class test {
    public static void main(String...args){
        Resource resource = new ClassPathResource("com/harshit/App04/configs/SpringConfig.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        EmployeeBean e = (EmployeeBean)beanFactory.getBean("employeebean");
        System.out.println(e);
    }
}

package com.springCore.SetterInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App 
{
    public static void main( String[] args )
    {
    	Resource r = new ClassPathResource("config.xml");
    	BeanFactory factory = new XmlBeanFactory(r);
    	
    	Employee emp = (Employee) factory.getBean("Emp");
    	emp.display();
    }
}

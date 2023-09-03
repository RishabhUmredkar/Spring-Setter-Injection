package com.springCore.DependentObject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("com/springCore/DependentObject/config.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		
		Employee emp = (Employee) factory.getBean("Emp");
		emp.display();
	}

}

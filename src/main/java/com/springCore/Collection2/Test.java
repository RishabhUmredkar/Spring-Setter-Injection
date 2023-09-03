package com.springCore.Collection2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("com/springCore/Collection2/config.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		
		Question Que = (Question) factory.getBean("Que1");
		Que.display();
	}

}

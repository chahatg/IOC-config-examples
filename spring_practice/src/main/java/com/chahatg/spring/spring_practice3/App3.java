package com.chahatg.spring.spring_practice3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App3 {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		MessageInterfaceImpl3 messenger = context.getBean(MessageInterfaceImpl3.class);
		messenger.printMsg("Hello World  - JAVA-BASED	 config");
	}
}

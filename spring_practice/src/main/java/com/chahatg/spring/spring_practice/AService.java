package com.chahatg.spring.spring_practice;

public class AService implements MessageService{
	public void deliverMsg(String msg) {
		System.out.println("Message from A Service: " + msg);
	}
}

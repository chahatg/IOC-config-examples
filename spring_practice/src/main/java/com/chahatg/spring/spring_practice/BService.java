package com.chahatg.spring.spring_practice;

public class BService implements MessageService{
	public void deliverMsg(String msg) {
		System.out.println("Message from B Service: " + msg);
	}
}

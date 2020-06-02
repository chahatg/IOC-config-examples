package com.chahatg.spring.spring_practice2;

import org.springframework.stereotype.Service;


@Service("A2Service")
public class A2Service implements MessageService2{
	public void deliverMsg(String msg) {
		System.out.println("Message from A2 Service: " + msg);
	}
}

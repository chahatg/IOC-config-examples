package com.chahatg.spring.spring_practice2;

import org.springframework.stereotype.Service;


@Service("B2Service")
public class B2Service implements MessageService2 {
	public void deliverMsg(String msg) {
		System.out.println("Message from B2 Service: " + msg);
	}
}

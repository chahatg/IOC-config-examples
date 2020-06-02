package com.chahatg.spring.spring_practice3;

import org.springframework.stereotype.Service;


@Service("B3Service")
public class B3Service implements MessageService3 {
	public void deliverMsg(String msg) {
		System.out.println("Message from B3 Service: " + msg);
	}
}

package com.aop.Spring_aspect_oriented_programming;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.Spring_aspect_oriented_programming.service.PaymentService;

/**
 * Hello world!
 *
 */
public class App 
{
   public static void main(String[] args) {
 
	   
	   ApplicationContext applicationContext =new ClassPathXmlApplicationContext("config.xml");
	   PaymentService paymentservice = (PaymentService) applicationContext.getBean("payment");
	   paymentservice.makePayment();     
	   
}
}

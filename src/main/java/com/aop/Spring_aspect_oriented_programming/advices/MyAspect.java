package com.aop.Spring_aspect_oriented_programming.advices;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	
	@Before("execution(* com.aop.Spring_aspect_oriented_programming.service.PaymentsServiceimplments.makePayment())")
	
	public void authoriseuser() {
		
		
		System.out.println("><><><><><><><authorisatation implemented<><><><><><");
	}
	
	
	

	@After
	(	"execution(* com.aop.Spring_aspect_oriented_programming.service.PaymentsServiceimplments.makePayment())")
	
	public void taskcompleted() {
		
		
		System.out.println("><><><><><><><task completed<><><><><><");
	}
	

}

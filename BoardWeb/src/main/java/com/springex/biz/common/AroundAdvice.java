package com.springex.biz.common;

public class AroundAdvice {
	public Object aroundLog(ProceedingJoinPoint) throws Throwable{
		System.out.println("비즈니스 메소드 수행전 ");
		Object returnObj = pjp.proceed();
		System.out.println("비즈니스 메소드 수행후 ");
	}
}

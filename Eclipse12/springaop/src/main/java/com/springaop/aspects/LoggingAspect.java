package com.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(* com.springaop.ProductServiceImpl.multiply(..))")
	public void logBefore(JoinPoint joinpoint) {
		System.out.println("메소드 호출 전");
	}
	@After("execution(* com.springaop.ProductServiceImpl.multiply(..))")
	public void logAfter(JoinPoint joinpoint) {
		System.out.println("메소드 호출 후");
	}
}

//1. execution: 어드바이스를 적용할 메소드 명시
//2. within: 특정 타입에 속하는 메소드를 명시
//within(com.springaop.ProductServiceImpl)
//within(com.springaop.*)

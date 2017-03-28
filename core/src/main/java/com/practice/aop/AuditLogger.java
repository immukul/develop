package com.practice.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuditLogger {
	
	@Pointcut("expression(public com.practice.core.*.*(..))")
	public void pointCutDecelared(){
		
		
	}
	
	@Before("pointCutDecelared()")
	private void getJoinPoints(JoinPoint joinPoint){
		System.out.println(joinPoint.getSignature().toShortString());
		
	}
	
	@AfterReturning(pointcut = "pointCutDecelared()",returning = "returnValue" )
	private void getJoinPointsAfterReturning(JoinPoint joinPoint, String returnValue){
		System.out.println(returnValue);
	}
	
	@AfterThrowing(pointcut = "pointCutDecelared()", throwing = "e")
	private void getJoinPointsAfterThrowing(JoinPoint joinPoint, String e){
		System.out.println(e);
	}
}

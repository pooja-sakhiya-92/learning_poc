package com.ga.learning.service;

import org.aopalliance.intercept.MethodInvocation;

public class HijackAroundMethod implements org.aopalliance.intercept.MethodInterceptor {


	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("Hijack around method called");
		System.out.println(invocation.getMethod().getName());
		return null;
	}

}

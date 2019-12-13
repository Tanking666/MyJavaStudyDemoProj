package com.my.spring.demo1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author 43735
 */
@Aspect
public class MyAspectAnno {
	@Before(value = "execution(* com.my.spring.demo1.service.carServicel.save(..))")
	public void checkPri() {
		System.out.println("注解权限校验");
	}
}

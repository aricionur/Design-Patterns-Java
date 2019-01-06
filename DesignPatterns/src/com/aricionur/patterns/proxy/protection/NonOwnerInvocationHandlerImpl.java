package com.aricionur.patterns.proxy.protection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandlerImpl implements InvocationHandler {

	Subject subject;

	public NonOwnerInvocationHandlerImpl(Subject subject) {
		this.subject = subject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {

		try {
			if (method.getName().startsWith("valid")) {
				throw new IllegalAccessException();
			} else if (method.getName().equals("nonValidMethodForOwner")) {
				return method.invoke(subject, args);
			}
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;

	}

}

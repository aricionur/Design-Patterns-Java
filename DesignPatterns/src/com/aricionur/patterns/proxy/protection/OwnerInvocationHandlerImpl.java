package com.aricionur.patterns.proxy.protection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnerInvocationHandlerImpl implements InvocationHandler {

	Subject subject;

	public OwnerInvocationHandlerImpl(Subject subject) {
		this.subject = subject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {

		try {
			if (method.getName().startsWith("valid")) {
				return method.invoke(subject, args);
			} else if (method.getName().equals("nonValidMethodForOwner")) {
				throw new IllegalAccessException();
			}
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;

	}

}

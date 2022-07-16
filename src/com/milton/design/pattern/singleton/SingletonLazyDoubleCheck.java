package com.milton.design.pattern.singleton;

public class SingletonLazyDoubleCheck {

	private static SingletonLazyDoubleCheck sc = null;

	private SingletonLazyDoubleCheck() {
	}

	public static SingletonLazyDoubleCheck getInstance() {
		if (sc == null) {
			synchronized (SingletonLazyDoubleCheck.class) {
				if (sc == null) {
					sc = new SingletonLazyDoubleCheck();
				}

			}
		}

		return sc;
	}

}

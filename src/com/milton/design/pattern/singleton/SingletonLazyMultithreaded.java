package com.milton.design.pattern.singleton;

/**
 * In this approach, we force every thread to wait its turn before it can enter the
 * method. So, no two threads will enter the method at the same time
 * 
 * @author milton
 *
 */
public class SingletonLazyMultithreaded {

	private static SingletonLazyMultithreaded sc = null;

	private SingletonLazyMultithreaded() {
	}

	/**
	 * problem is it reduce performance
	 */
	public static synchronized SingletonLazyMultithreaded getInstance() {
		if (sc == null) {
			sc = new SingletonLazyMultithreaded();
		}
		return sc;
	}
}

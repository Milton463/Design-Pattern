package com.milton.design.pattern.singleton;

/**
 * @author milton
 *
 */

public class SingletonEgar {
	private static SingletonEgar sc = new SingletonEgar();

	private SingletonEgar() {
	}

	/**
	 * in this approach the problem is the object would get created as soon as the
	 * class gets loaded into the JVM. If the object is never requested, there would
	 * be an object useless inside the memory
	 */
	public static SingletonEgar getInstance() {
		return sc;
	}

}

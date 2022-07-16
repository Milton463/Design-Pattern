package com.milton.design.pattern.singleton;

/**
 * It’s always a good approach that an object should get created when it is
 * required. So, we will create an object on the first call and then will return
 * the same object on other successive calls.
 * 
 * @author milton
 *
 */

public class SingletonLazy {

	private static SingletonLazy sc = null;

	private SingletonLazy() {
	}

	/**
	 * problem in multi-threaded environment Imagine two threads concurrently
	 * accessing the class, thread t1 gives the first call to the getInstance()
	 * method, it checks if the static variable sc is null and then gets interrupted
	 * due to some reason. Another thread t2 calls the getInstance() method
	 * successfully passes the if check and instantiates the object. Then, thread t1
	 * gets awake and it also creates the object. At this time, there would be two
	 * objects of this class.
	 * 
	 */
	public static SingletonLazy getInstance() {
		if (sc == null) {
			sc = new SingletonLazy();
		}

		return sc;
	}

}

package com.milton.design.pattern.singleton;

public class SingletonLazyInnerStaticHolder {
	private static class SingletonHolder {
		public static final SingletonLazyInnerStaticHolder sc = new SingletonLazyInnerStaticHolder();
	}

	private SingletonLazyInnerStaticHolder() {

	}
	
	public static SingletonLazyInnerStaticHolder getInstance() {
		return SingletonLazyInnerStaticHolder.SingletonHolder.sc;
	}

}

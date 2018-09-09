package com.hwua.exercise;

public class Singal {

	private static Singal singal = null;

	private Singal() {

	}

	static Object obj = new Object();

	public static Singal getSingal() {
		if (singal == null) {
			synchronized (obj) {
				if (singal == null) {
					singal = new Singal();
				}
			}

		}

		return singal;

	}

	public void outPut() {
		System.out.println("this is singal model");
	}
}

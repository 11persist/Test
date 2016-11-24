package com.Test.RReflect;

import java.lang.reflect.Array;

public class ArrayDemo1 {
	public static void main(String[] args) throws Exception {
		
		
		stringStr();
		stringArray();
	}

	private static void stringArray() {
		// TODO Auto-generated method stub
		
	}

	private static void stringStr() throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class<?> classType = Class.forName("java.lang.String");
		Object array = Array.newInstance(classType, 5);
		Array.set(array, 3, "hello");
		String s = (String) Array.get(array, 3);
		System.out.println(s);
	}
}

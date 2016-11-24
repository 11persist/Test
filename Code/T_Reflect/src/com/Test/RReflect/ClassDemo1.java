package com.Test.RReflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class A{
	private Integer uid;
	private Integer age;
	private String name;
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	public A(Integer uid, Integer age, String name) {
		super();
		this.uid = uid;
		this.age = age;
		this.name = name;
	}
	public Integer getUid() {
		System.out.println("getUid");
		return uid;
	}
	public void setUid(Integer uid) {
		System.out.println("setUid");
		this.uid = uid;
	}
	public Integer getAge() {
		System.out.println("getAge");
		return age;
	}
	public void setAge(Integer age) {
		System.out.println("setAge");
		this.age = age;
	}
	public String getName() {
		System.out.println("getName");
		return name;
	}
	public void setName(String name) {
		System.out.println("setName");
		this.name = name;
	}
}

public class ClassDemo1 {
	public static void main(String[] args) {
		//constructorTest();
//		methodTest();
//		parameterTest();
		callMethod();
	}
	
	public static void callMethod(){
		try{
			A a = new A();
			Class clazz = a.getClass();
			
			Field[] fields = clazz.getDeclaredFields();
			for(Field f:fields){
				String m1 = "get"+f.getName().toUpperCase().substring(0,1)+f.getName().substring(1);
				//Class c = f.getType();
				Method m = clazz.getDeclaredMethod(m1);
				m.invoke(a);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void parameterTest(){
		try {
			Class clazz = Class.forName("com.Test.RReflect.A");
			Field[] field= clazz.getDeclaredFields();
			for(Field f:field){
				Class c = f.getType();
				System.out.println(c.getName()+" "+f.getName());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void methodTest(){
		try{
			Class method = Class.forName("com.Test.RReflect.A");
			Method[] me = method.getDeclaredMethods();
			
			for(Method m:me){
				Class[] c = m.getParameterTypes();
				for(Class cc:c){
					System.out.print(cc.getSimpleName()+" ");
				}
				System.out.println(m.getName());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void constructorTest(){
		try {
			Class test = Class.forName("com.Test.RReflect.A");
			
			Constructor[] constructor = test.getDeclaredConstructors();
			
			for(Constructor c:constructor){
			    Class[] c1 = c.getParameterTypes();
			    for(Class cc:c1){
			    	System.out.print(cc.getName()+" ");
			    }
				System.out.println(c.getName());
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


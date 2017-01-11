package com.other;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Collection1 {
	public static void main(String[] args) {
		list1("ArrayList");
		list1("LinkedList");
		list1("Stack");
		list1("Vector");
	}

	private static void list1(String str) {
		// TODO Auto-generated method stub
		List<String> list = null;
		switch(str){
		case "ArrayList":
			list = new ArrayList();
			break;
		case "LinkedList":
			list = new LinkedList();
			break;
		case "Stack":
			list = new Stack();
			break;
		case "Vector":
			list = new Vector();
			break;
			default:
				System.err.println("ERROR");  
		}
		list.add(null);
		list.add("");
		list.add("abc");
		list.add("aaa");
		list.add("ace");
		list.add("ccc");
		list.add("bbb");
		
		
		for(String l:list){
			System.out.print(l + " ");
		}
		System.out.println("\n-------------------------");
		
	}


}

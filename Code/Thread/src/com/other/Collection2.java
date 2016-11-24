package com.other;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collection2 {
	public static void main(String[] args) {
		set1("HashSet");
		set1("LinkedHashSet");
		set1("TreeSet");
	}

	private static void set1(String str) {
		// TODO Auto-generated method stub
		Set<String> set = null;
		switch(str){
		case "HashSet":
			set = new HashSet();
			break;
		case "TreeSet":
			set = new TreeSet();
			break;
		case "LinkedHashSet":
			set = new LinkedHashSet();
			break;
			default:
				System.err.println("ERROR");  
		}
		set.add(null);
		set.add("");
		set.add("abc");
		set.add("aaa");
		set.add("ace");
		set.add("ccc");
		set.add("bbb");
		
		
		for(String l:set){
			System.out.print(l + " ");
		}
		System.out.println("\n-------------------------");
	}
	
	
}

package com.other;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class Collection3 {
	
	public static void main(String[] args) {
		map1("HashMap");
		map1("LinkedHashMap");
		map1("TreeMap");
		map1("Hashtable");
		map1("IdentityHashMap");
		map1("WeakHashMap");
	}

	private static void map1(String str) {
		// TODO Auto-generated method stub
		Map<String,String> map = null;
		switch(str){
		case "HashMap": //排序了,根据Key
			map = new HashMap();
			break;
		case "TreeMap"://key不能为空,排序了!
			map = new TreeMap();
			break;
		case "LinkedHashMap": //没排序,按照输入输出.
			map = new LinkedHashMap();
			break;
		case "Hashtable"://key和value都不能为空
			map = new Hashtable();
			break;
		case "IdentityHashMap": //排序和HashMap一样
			map = new IdentityHashMap();
			break;
		case "WeakHashMap"://和LinkedHashMap一样
			map = new WeakHashMap();
			break;
			default:
				System.err.println("ERROR");  
		}
		
		System.out.println("--"+str+"--");
//		map.put(null, null);
//		map.put("有毒",null);
		map.put("","");
		map.put("abc","1");
		map.put("aaa", "55");
		map.put("aaa","2");
		map.put("ace","333");
		map.put("ccc","66");
		map.put("bbb","33121");
		
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()){
			Entry<String, String> en= (Entry<String, String>) it.next();
			System.out.println(en.getKey() + " " + en.getValue());
		}
		
		System.out.println("\n-------------------------");
	}
}

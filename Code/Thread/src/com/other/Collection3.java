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
		case "HashMap": //������,����Key
			map = new HashMap();
			break;
		case "TreeMap"://key����Ϊ��,������!
			map = new TreeMap();
			break;
		case "LinkedHashMap": //û����,�����������.
			map = new LinkedHashMap();
			break;
		case "Hashtable"://key��value������Ϊ��
			map = new Hashtable();
			break;
		case "IdentityHashMap": //�����HashMapһ��
			map = new IdentityHashMap();
			break;
		case "WeakHashMap"://��LinkedHashMapһ��
			map = new WeakHashMap();
			break;
			default:
				System.err.println("ERROR");  
		}
		
		System.out.println("--"+str+"--");
//		map.put(null, null);
//		map.put("�ж�",null);
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

package com.set;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class C {
	public static void main(String[] args) {
		
	
	Map <Integer,Integer>m=new HashMap<>();
	m.put(1, 11);
	m.put(2, 22);
	m.put(3, 33);
	m.put(4, 44);
	m.put(5, 55);
	
	System.out.println(m);
	
	int size = m.size();
	System.out.println(size);
	
	Object object = m.get(1);
	System.out.println(object);
	
	Object remove = m.remove(null);
	System.out.println(remove);
	System.out.println(m);
	
	Set keySet = m.keySet();
	System.out.println(keySet);
	
	Collection values = m.values();
	System.out.println(values);
	System.out.println("-----------------");
	
	Set<Entry<Integer, Integer>> entrySet = m.entrySet();
	for (Entry<Integer, Integer> x : entrySet) {
		System.out.println(x.getKey());
		Integer key = x.getKey();
	
		System.out.println(x.getValue());
		
	}
}
}
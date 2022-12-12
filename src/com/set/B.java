package com.set;

import java.util.Set;
import java.util.TreeSet;

public class B {

	public static void main(String[] args) {

		Set<Integer> s = new TreeSet();
		s.add(1);
		s.add(2);
		s.add(3);

		Set<Integer> a = new TreeSet();
		a.add(11);
		a.add(12);
		
		for (Integer u : a) {
			System.out.println(u);
			
		}
		
		a.retainAll(s);
		System.out.println(a);
		
		a.removeAll(s);
		System.out.println(a);

		System.out.println(s);

		int size = s.size();
		System.out.println(size);

		s.clear();
		System.out.println(s);
		boolean c = s.contains(1);
		System.out.println(c);

	}
}
package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {
	public static void main(String[] args) {
		Set si=new HashSet();	
		
		si.add(100);
		si.add("dinesh");
		si.add(true);
		si.add(1234.678f);
		si.add('D');
		si.add(100);
		si.add(100);
		si.add(null);

		
		
		System.out.println(si); //console will be random order , no duplicate ,allows null
	
	
	Set di=new LinkedHashSet();
	di.add(100);
	di.add("dinesh");
	di.add(true);
	di.add(1234.678f);
	di.add('D');
	di.add(100);
	di.add(100);
	di.add(null);
	
	System.out.println(di); //console will be insertion order , no duplicate ,allows null

	Set fi=new TreeSet();
	fi.add("100");
	fi.add("dinesh");
	fi.add("true");
	fi.add("1234.678f");
	fi.add("D");
	fi.add("100");
	fi.add("100");
	
	
	
	
	System.out.println(fi);
	
	
	int size = fi.size();
	System.out.println(size);
	
	boolean contains = fi.contains("D");
	System.out.println(contains);
			
	fi.clear();
	System.out.println(fi);
	
	}
}

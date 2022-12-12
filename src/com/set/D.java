package com.set;

public class D {
	@Test
	public  void main() {
		
	
	
	String s="dineshkumar";
	String s1="priyu";
	String concat = s1.concat(s);
	System.out.println(concat);
	boolean equals = s1.equals(s);
	System.out.println(equals);
	
	String replace = s.replace("din", "Din");
	System.out.println(replace);
	

	
	 int length = s.length();
	 System.out.println(length);
	
	 String upperCase = s.toUpperCase();
	 System.out.println(upperCase);

	 String lowerCase = s.toLowerCase();
	 System.out.println(lowerCase);
	 
	 int indexOf = s.indexOf("d");
	 System.out.println(indexOf);
	 
	boolean contains = s.contains("e");
	System.out.println(contains);
	
	String substring = s.substring(5);
	System.out.println(substring);
	
	String substring2 = s.substring(3, 5);
	System.out.println(substring2);
	char charAt = s.charAt(0);
	System.out.println(charAt);
}
}
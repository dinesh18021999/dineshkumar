package com.practice;

public class Company extends Industry  {
	
	public void companyName(String name) {
System.out.println(name);
}
public static void main(String[] args) {
	Company c=new Company();
	c.companyName("tcs");
	
	
	c.industryName("hyundai");
	
}
}
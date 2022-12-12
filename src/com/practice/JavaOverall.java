package com.practice;

public class JavaOverall extends Industry {
	
	public void employeeName(String name) {
		System.out.println("The employee name is dinesh:"+ name);
	}
		public void employeeId(int id) {
		System.out.println("the id is:"+ id);
		}	

public static void main(String[] args) {
	JavaOverall n=new JavaOverall();
	n.employeeName("dinesh");
	n.employeeId(23);
	
}
}
package com.employee;

public class Employee {

	public static void main(String[] args) {
		int isPresent=(int)Math.floor(Math.random()*10) % 2;
		if(isPresent==1) {
			System.out.println("Employee is Present : "+isPresent);
		}
		else {
			System.out.println("Employee is not Present : "+isPresent);
		}
	}

}

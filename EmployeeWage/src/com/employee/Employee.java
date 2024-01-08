package com.employee;

public class Employee {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		if(isPresent()) {
			System.out.println("Hi Mannesh,Employee is Present ");
		}
		else {
			System.out.println("Employee is not Present ");
		}
	}
	
	public static boolean isPresent() {
		int is_present=(int)Math.floor(Math.random()*10) % 2;
		if(is_present==1) {
			return true;
		}
		else {
			return false;
		}
	}

}

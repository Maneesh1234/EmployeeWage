package com.employee;


public class Employee {

	private static int WAGE_PER_HOUR=20;
	private static int FULL_DAY_HOUR=8;
	private static int FULL_DAY_WAGE=WAGE_PER_HOUR*FULL_DAY_HOUR;
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program");
		if(isPresent()) {
			System.out.println("Hi, Employee is Present ");
			System.out.println("Full day wage is "+FULL_DAY_WAGE);
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

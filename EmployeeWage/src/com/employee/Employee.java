package com.employee;

public class Employee {

	private static int WAGE_PER_HOUR=20;
	private static int FULL_DAY_HOUR=8;
	private static int FULL_DAY_WAGE=WAGE_PER_HOUR*FULL_DAY_HOUR;
	private static int PART_TIME_HOUR=4;
	private static int PART_TIME_WAGE=PART_TIME_HOUR*WAGE_PER_HOUR;
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program");
		if(isEmpPresent()) {
			System.out.println("Hi, Employee is Present ");
			switch (getEmpType()) {
			case "part_time": 
				System.out.println("Part time Day wage is "+PART_TIME_WAGE);
				break;
			case "full_time":
				System.out.println("Full day wage is "+FULL_DAY_WAGE);
			}
		}
		else {
			System.out.println("Employee is not Present ");
		}
	}
	
	public static String getEmpType() {
		String [] s= {"full_time","part_time"};
		int index=(int)(Math.random()*s.length);
		return s[index];
		
	}
	
	public static boolean isEmpPresent() {
		int is_present=(int)Math.floor(Math.random()*10) % 2;
		if(is_present==1) {
			return true;
		}
		else {
			return false;
		}
	}

}

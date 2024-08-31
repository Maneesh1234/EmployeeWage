package com.employee;

public class Employee {

	private static int WAGE_PER_HOUR=20;
	private static int FULL_DAY_HOUR=8;
	private static int FULL_DAY_WAGE=WAGE_PER_HOUR*FULL_DAY_HOUR;
	private static int PART_TIME_HOUR=4;
	private static int PART_TIME_WAGE=PART_TIME_HOUR*WAGE_PER_HOUR;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		System.out.println("Hi good morning");
		calculateEmpWage();
		System.out.println("Maneesh Kumar");
	}
	
	public static void calculateEmpWage() {
		int total_wage=0;
		int count_full_day=0;
		int count_half_day=0;
		int count_absent=0;
		int total_working_hour=0;
		while (count_full_day+count_half_day+count_absent <20 && total_working_hour<100) {
			if(isEmpPresent()) {
				System.out.println("Hi, Employee is Present ");
				switch (getEmpType()) {
				case "part_time": 
					total_wage+=PART_TIME_WAGE;
					total_working_hour+=PART_TIME_HOUR;
					count_half_day+=1;
					break;
				case "full_time":
					total_wage+=FULL_DAY_WAGE;
					total_working_hour+=FULL_DAY_HOUR;
					count_full_day+=1;
				}
			}
			else {
				count_absent+=1;
				System.out.println("Employee is not Present ");
			}
		}
		System.out.println("Employee Total Wage For a month is :"+ total_wage);
		System.out.println("Employee Full Present days :"+ count_full_day);
		System.out.println("Employee Half Present days :"+ count_half_day);
		System.out.println("Employee Absent days :"+ count_absent);
		System.out.println("Employee Total hour is :"+total_working_hour);	
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

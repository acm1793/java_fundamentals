package com.qa.java;

public class ElseTest {

	public static void main(String[] args) {
		int num1;
		num1 = 60;
		if (num1 % 2 == 0) {
			System.out.println(num1 + " is a even number.");
		} else {
			System.out.println(num1 + " is a odd number.");
		}
		/*
		 * decide increment percentage based on experience if experience is grater than
		 * 2 years and department is development then increment 10%
		 * 
		 * if experience is greater than 5 years and department is sales then increment
		 * 8%
		 */
		float salary;
		salary = 4000.8f;
		byte experience;
		experience = 4;
		char department;
		department = 'D';
		byte incrementPercentage;

		if ((experience > 2) && (department == 'D')) {
			incrementPercentage = 10;
		} else if (experience > 5 && department == 'S') {
			incrementPercentage = 8;
		} else {
			incrementPercentage = 5;
		}
		salary = salary + (salary * incrementPercentage / 100);
		System.out.println(salary);

	}
}
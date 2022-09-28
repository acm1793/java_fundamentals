package com.qa.java;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Assignment Operator
		// = is used to assign values

		int salary;
		salary = 37000;
		float productPrice;
		productPrice = 174.7f;

		salary = salary + (salary * 10 / 100);
		System.out.println(salary);

		float discount;
		discount = (productPrice * 5 / 100);
		System.out.println("Discount is " + discount);

		float finalPrice;
		finalPrice = (productPrice - discount);
		System.out.println(finalPrice);

		byte num1;
		num1 = 10;
		System.out.println(num1++);

		byte num2;
		num2 = 20;
		System.out.println(num2--);

		/*
		 * > >= < <= == !=
		 */

		System.out.println(salary > 50000);
		System.out.println(salary >= 50000);
		System.out.println(salary < 50000);
		System.out.println(salary <= 50000);
		System.out.println(salary == 50000);
		System.out.println(salary != 50000);

		/*
		 * Logical Operators && AND || OR ^ XOR
		 */

		// (exp1) && (exp2) && (exp3)
		// Rule
		// If any of the expression is false, then the entire resultant is false
		/*
		 * T T -> T T F -> F F T -> F F F -> F
		 */
		
		salary = 30435;
		byte age = 25;
		System.out.println((salary > 50000) && (age < 30));

		// (exp1) || (exp2) || (exp3)
		// Rule
		// If any of the expression is true, then the entire resultant is true
		/*
		 * T T -> T T F -> T F T -> T F F -> F
		 */

		salary = 30435;
		byte age1 = 25;
		System.out.println((salary < 50000) || (age1 > 30));

		// (exp1) ^ (exp2) ^ (exp3)
		// Rule
		// If both the expressions are evaluated to the same result, then the resultant
		// is false
		/*
		 * T T -> F 
		 * T F -> T 
		 * F T -> T 
		 * F F -> F
		 */
	}

}

package com.qa.java;

public class OddNumbers {

	public static void main(String[] args) {
		/*
		 * Print all numbers from 1 to 1000
		 */

		int number = 1;
		while (number <= 1000) {
			if (number % 2 != 0) {

				System.out.println(number);
			}
			number++;

		}

	}

}

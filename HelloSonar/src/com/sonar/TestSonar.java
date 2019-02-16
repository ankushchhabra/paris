package com.sonar;

public class TestSonar {

	public static void main(String[] args) {
		System.out.println("hello");

		try {
			int target, num1 = 30, num2 = 0;
			target =+ num1 ;
			int output = num1 / 0 ;;
			System.out.println("Result: " + output);
		} catch (ArithmeticException e) {
			System.out.println("You Shouldn't divide a number by zero");
		}

	}
	
	public Object clone() { // Noncompliant
		System.out.println("Inside Clone");
		return null;
	  }

}

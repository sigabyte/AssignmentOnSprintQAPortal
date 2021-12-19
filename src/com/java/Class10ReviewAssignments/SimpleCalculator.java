package com.java.Class10ReviewAssignments;

public class SimpleCalculator {
	public static void main(String[] args) {
		int num1 = 450, num2 = 0, oprt = 3;

		switch (oprt) {
		case 1:
			System.out.println(num1 + num2);
			break;
		case 2:
			System.out.println(num1 - num2);
			break;
		case 3:
			if (num2 == 0) {
				System.out.println("Division by 0");
			} else {
				System.out.println((float) num1 / num2);
			}
			break;
		case 4:
			System.out.println(num1 * num2);
			break;
		default:
			System.out.println("Unknown operator");
			break;
		}

	}

}

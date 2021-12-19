package com.java.Class10ReviewAssignments;

public class PrintEvenNumbersFrom1To13 {
	public static void main(String[] args) {
		int num = 1;

		while (num < 13) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
			num++;
		}

	}

}

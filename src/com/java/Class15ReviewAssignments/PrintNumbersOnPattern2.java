package com.java.Class15ReviewAssignments;

public class PrintNumbersOnPattern2 {
	public static void main(String[] args) {
		
		for (int a = 1; a <= 1; a++) {
			for (int i = 1; i <= 11 - a; i++) {
				System.out.print(i);
				System.out.print(" ");
			}
			System.out.println();

			for (int b = 1; b <= 21 - a; b++) {
				if (b % 2 == 0) {
					System.out.print(b);
					System.out.print(" ");
				}
			}
			System.out.println();

			for (int c = 1; c <= 31 - a; c++) {
				if (c % 3 == 0) {
					System.out.print(c);
					System.out.print(" ");
				}
			}
			System.out.println();

			for (int c = 1; c <= 41 - a; c++) {
				if (c % 4 == 0) {
					System.out.print(c);
					System.out.print(" ");
				}
			}
			System.out.println();

			for (int c = 1; c <= 51 - a; c++) {
				if (c % 5 == 0) {
					System.out.print(c);
					System.out.print(" ");
				}
			}
			System.out.println();

		}

	}

}

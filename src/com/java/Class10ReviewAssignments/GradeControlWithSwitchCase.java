package com.java.Class10ReviewAssignments;

public class GradeControlWithSwitchCase {
	public static void main(String[] args) {
		String grade = "F";

		switch (grade) {

		case "A":
			System.out.println("Excellent");
			break;
		case "B":
			System.out.println("Good");
			break;
		case "C":
			System.out.println("Average");
			break;
		case "E":
			System.out.println("Bad");
			break;
		default:
			System.out.println("Enter grade A,B,C,E");
		}

	}

}

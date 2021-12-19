package com.java.Class15ReviewAssignments;

public class CreateArray3 {
	public static void main(String[] args) {
		int year[] = new int[11];

		for (int i = 0; i < year.length; i++) {
			year[i] = 2010 + i;
			System.out.println(year[i]);
			System.out.println("");
		}
	}

}

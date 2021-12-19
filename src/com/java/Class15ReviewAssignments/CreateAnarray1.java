package com.java.Class15ReviewAssignments;

public class CreateAnarray1 {
	public static void main(String[] args) {
		String letters[] = { "s", "a", "p", "b", "r", "c", "i", "d", "n", "t", "g", "q", "h", "a" };
		//System.out.println(letters[1]);
		for (int i = 0; i < letters.length; i++) {
			System.out.print(letters[i]);
			i = i + 1;
		}
	}
}

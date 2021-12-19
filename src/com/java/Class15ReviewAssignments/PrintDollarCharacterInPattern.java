package com.java.Class15ReviewAssignments;

public class PrintDollarCharacterInPattern {
	public static void main(String[] args) {
		for(int i=1; i<=7;i++) {
			for(int s=1; s<=i; s++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<6-i;j++) {
				System.out.print("$");
				
			}
			
			
			System.out.println(" ");
			System.out.println();
		}

	}

}

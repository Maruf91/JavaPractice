package com.java.abdul.bari.learning;

import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A[] = { 3, 9, 6, 8, 12, 4, 10, 25, 7 };
		int key;
		System.out.println("Enter the element you want to search.....");
		key = sc.nextInt();
		for (int i = 0; i < A.length; i++) {
			if (key == A[i]) {
				System.out.println("Element is found at index: " + i);
				System.exit(0);
			}

		}
		System.out.println("Element is not found....!!!");
		sc.close();
	}
}

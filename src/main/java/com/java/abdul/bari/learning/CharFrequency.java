package com.java.abdul.bari.learning;

import java.util.Scanner;

public class CharFrequency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string you want to check character frequency...");
		String key = sc.nextLine();
		char charArray[]=new char[key.length()];
		for(int i=0;i<key.length();i++) {
			charArray[i]=key.charAt(i);
		}
		System.out.println("**************String into char array: ***********");
		for(char c:charArray) {
			System.out.println(c);
		}
		int counter=0;
		for(int k=0;k<charArray.length;k++) {
			if(charArray[k]==charArray[k+1]) {
				System.out.println("char is: ");
			}
		}
		
		sc.close();

	}

}

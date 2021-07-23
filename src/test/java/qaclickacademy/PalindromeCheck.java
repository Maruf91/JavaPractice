package qaclickacademy;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input=sc.nextLine();
		StringBuilder sb=new StringBuilder(input);
		sb.reverse();
		String rev=sb.toString();
		System.out.println("Reverse string is: "+rev);
		if(input.equals(rev)) {
			System.out.println("The string is plaindrome");
		}

		else {
			System.out.println("Not palindrome");
		}
	}

}

package qaclickacademy;

import java.util.Scanner;

import org.testng.annotations.Test;

public class FindoutPrimeNumber {

	@Test
	public void findOutPrime()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a valid number: ");
		int input=sc.nextInt();
		if(input%2!=0)
		{
			System.out.println("The number is prime!!");
		}
		else
		{
			System.out.println("The number is even");
		}
		
		
	}
	
	
}

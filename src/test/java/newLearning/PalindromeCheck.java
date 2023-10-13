package newLearning;

public class PalindromeCheck {
	
	
	public static void palindromeNumber(int number) {
		System.out.println("*************Welcome to Palindrome number check************");
		int r,sum=0;
		//int number = 424 ;
		int n=number;
		while(n>0) 
		{
			r=n%10;
			System.out.println("remaineder value: " +r);
			sum=(sum*10)+r;
			n=n/10; 
		}
		System.out.println(sum);
		System.out.println(number);
		if(number==sum)
			System.out.println("number is palindrome");
		else System.out.println("number is not Palindrome");
			
	}
	
	public static void plaindromeString(String str) {
		//String str="madam";
		String revStr="";
		//System.out.println(str.length());
		
		  for(int i=str.length(); i>0;i--) 
		  { 
		 // System.out.println(i);
		 // System.out.println(str.charAt(i-1)); 
		  revStr=revStr+str.charAt(i-1);
		  }
		  
		  if(str.equals(revStr))
				System.out.println("string is palindrome");
			else System.out.println("string is not Palindrome");
		 
	}

	public static void main(String[] args) {
		palindromeNumber(424);
		plaindromeString("racecar");
			

	}

}

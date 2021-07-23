package pwcBaseClass;

import java.util.Arrays;
import java.util.Scanner;

public class StringPermutation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1 = sortString(str);
		printPermuation(str1,"");

	}
	
	public static void printPermuation(String ques, String asf) {
		
		if(ques.length()==0) {
			System.out.println(asf);
			
			return;
		}
		
		for(int i=0;i<ques.length();i++) {
			char ch=ques.charAt(i);
			String qLpart=ques.substring(0, i);
			String qRpart=ques.substring(i+1);
			String roq=qLpart+qRpart;
			printPermuation(roq,ch+asf);
		}
		
		
	}
	
	static String sortString(String inputString)
	{
		
		// Convert input string to char array
		char tempArray[] = inputString.toCharArray();
		
		// Sort tempArray
		Arrays.sort(tempArray);
		
		// Return new sorted string
		return new String(tempArray);
	}

}

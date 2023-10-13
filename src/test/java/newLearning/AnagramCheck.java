package newLearning;

import java.util.Arrays;

public class AnagramCheck {
	
	public static boolean isAnagram(String str1, String str2) {
		
		char [] arr1= str1.toLowerCase().toCharArray();
		char [] arr2= str2.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
		
	}

	public static void main(String[] args) {
		
		String str1= "Listen";
		String str2 = "Silent";
		
		if (isAnagram(str1, str2))
			System.out.println("This is Anagram");
		else
			System.out.println("This is not Anagram");
			
	}

}

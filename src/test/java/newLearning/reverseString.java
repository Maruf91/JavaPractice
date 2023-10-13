package newLearning;

public class reverseString {

	public static void main(String[] args) {
		String str="marufmallick Kolkata";
		String revStr="";
		char ch;
		//System.out.println(str.length());
		/*
		 * for(int i=str.length(); i>0;i--) 
		 * { 
		 * //System.out.println(i);
		 * //System.out.println(str.charAt(i-1)); 
		 * revStr=revStr+str.charAt(i-1);
		 * }
		 */
		for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); //extracts each character
	       // System.out.println(ch);
	        revStr= ch+revStr; //adds each character in front of the existing string
	        System.out.println(revStr);
	      }
		
		System.out.println(revStr);

	}

}

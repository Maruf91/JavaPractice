package qaclickacademy;

public class StringReverse {

	public static void main(String[] args) {
		String str="maruf is a good boy";//
		int len=str.length();
		System.out.println("Length is: "+len);
		String rev="";
		for (int i=len-1;i>=0; i--) {
			
			rev=rev+str.charAt(i);
			
			
		}
		System.out.println("Reverse string is:"+rev);

	}

}

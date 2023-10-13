package cognizant;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Regex {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter your name");
	        String a = sc.nextLine();

	        System.out.println("Enter your PAN number");
	        String s = sc.next();
	        String p = "[A-Z]{5}[0-9]{4}[A-Z]";

	        if (Pattern.matches(p, s)) {
	            System.out.println("Enter your email id");
	            String m = sc.next();
	            String regexMail = "[a-z]{5,10}[@][a-z]{7}[.][a-z]{3}";

	            System.out.println(m);

	            if (Pattern.matches(regexMail, m) && m.endsWith("digitec.com")) {
	                System.out.println("Profile of " + a + " updated successfully");
	            } else {
	                System.out.println("Invalid E-mail ID");
	            }
	        } else {
	            System.out.println(s + " is an invalid PAN number");
	        }
	    }
	}
	/*
	 * Enter your name Maruf Enter your PAN number CSJPM4125K Enter your email id
	 * maruf@digitec.com
	 */

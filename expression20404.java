package hellojava4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class expression20404 {

	public static void main(String[] args) {

		System.out.println("文字列を入力してください。");

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String pattern = "^[1-5]+$";

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);
//		System.out.println(m.find());
		boolean result = m.find();
	    if ( result = true) {
	    	System.out.println("The character strings are all half-width numbers.");
	    }

		String str1 = scan.next();
	    String pattern1 = "^[a-zA-Z0-9]+$";
	    Pattern p1 = Pattern.compile(pattern1);
		Matcher m1 = p1.matcher(str1);
		boolean result1 = m1.find();
//		System.out.println(m1.find());
	    if ( result1 = true) {
	    	System.out.println("The character strings are all alphanumeric characters.");
	    }

		String str2 = scan.next();
//	    String str2 = "I'm just a panda.";
	    String pattern2 = "[.' a-zA-Z]";

	    Pattern p2 = Pattern.compile(pattern2);
		Matcher m2 = p2.matcher(str2);
//		System.out.println(m2.find());
		boolean result2 = m2.find();
		if ( result2 = true) {
	    	System.out.println("The character string is half-width English.");
	    }

		String str3 = scan.next();
		String pattern3 = "^[0-9]{2,4}-[0-9]{2,4}-[0-9]{3,4}$";

		Pattern p3 = Pattern.compile(pattern3);
		Matcher m3 = p3.matcher(str3);
		boolean result3 = m3.find();
		if ( result3 = true) {
	    	System.out.println("The string is a phone number.");
	    }

		String str4 = scan.next();
		String pattern4 = "[^.'\sa-z0-9]";

		Pattern p4 = Pattern.compile(pattern4);
		Matcher m4 = p4.matcher(str4);
		boolean result4 = m4.find();
		if ( result4 = true) {
	    	System.out.println("The string is neither.");
	    }



	}

}

package hellojava4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class expression20404 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String pattern = "^[1-5]+$";
	    String pattern1 = "^[a-zA-Z0-9]+$";
	    String pattern2 = "^[.'\sa-zA-Z]+$";
	    String pattern3 = "^[0-9]{2,4}-[0-9]{2,4}-[0-9]{3,4}$";
	    String pattern4 = "^[^.'\sa-z0-9]+$";

	    Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);
		Pattern p1 = Pattern.compile(pattern1);
		Matcher m1 = p1.matcher(str);
		Pattern p2 = Pattern.compile(pattern2);
		Matcher m2 = p2.matcher(str);
		Pattern p3 = Pattern.compile(pattern3);
		Matcher m3 = p3.matcher(str);
		Pattern p4 = Pattern.compile(pattern4);
		Matcher m4 = p4.matcher(str);

		boolean result = m.find();
		boolean result1 = m1.find();
		boolean result2 = m2.find();
		boolean result3 = m3.find();
		boolean result4 = m4.find();
		if (result) {
	    	System.out.println("The character strings are all half-width numbers.");
	    } else if (result1){
    		System.out.println("The character strings are all alphanumeric characters.");
	    } else if (result2){
    		System.out.println("The character string is half-width English.");
    	} else if (result3){
			System.out.println("The string is a phone number.");
    	} else if (result4) {
			System.out.println("The string is neither.");
    	}

	}

}

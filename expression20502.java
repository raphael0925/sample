package hallojava5;

public class expression20502 {

	public static void main(String[] args) {
		String str =
				"The,
	    		scientific,
	    		name,
	            persica,
	    		along,
	    		with,
	    		the,
	    		word,
	    		peach,
	    		itself,
	    		and,
	    		its,
	    		cognates,
	    		in,
	    		many,
	    		European,
	    		languages,
	    		derives,
	    		from,
	    		an,
	    		early,
	    		European,
	    		belie,
	    		that,
	    		peaches,
	    		were,
	    		native,
	    		to,
	    		Persia,
	    		(modern-day,
	    		Iran).";

		String[] words = str.split(",");

	    for (int i = 0; i < words.length; i++) {
	      System.out.println(words[i]);
	    }

	}

}

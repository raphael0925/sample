package hellojava;

public class expression6 {

	public static void main(String[] args) {
        int plus = 1;
        int before = 0;
        int after = 0;


        while ( plus < 100 ) {

        	after = before + plus;

//        	System.out.println((i*i)+"+"+j+"="+((i*i)+j));
        	System.out.println(before + "+" + plus + "=" + after);

        	plus += 2;

        	before = after;

        }
	}
}
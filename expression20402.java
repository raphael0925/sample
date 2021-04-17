package hellojava4;

public class expression20402 {

	public static void main(String[] args) {
		String name1 = "  panda";
		String name2 = " pan da ";
		String name3 = "panda  ";

		String result1 = name1.trim();
		System.out.println(result1);
		
		String result2 = name2.trim();
		System.out.println(result2);
		
		String result3 = name3.trim();
		System.out.println(result3);

//		String name = "\"panda\"";
//		System.out.printf("%9s\n",name);
//		System.out.printf("\"\tpan\tda\t\"\n");
//		System.out.printf("%-9s\n",name);
	}

}

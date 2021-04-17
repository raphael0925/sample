package hellojava;

public class expression8 {

	public static void main(String[] args) {
		int a = 100000;
		int b = 240000;
		int c = a + b;
		for (int i = 1; i <= 10; i++) {
		a = a + b;
		c = (int) (a * 1.07);
		System.out.printf("%2d%s",i,"年目");
		System.out.printf("%,10d%s",a,"円");
		System.out.printf("%,10d%s\n",c,"円");

		}
	}

}

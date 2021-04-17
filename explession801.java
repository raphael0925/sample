package hellojava;

public class explession801 {

	public static void main(String[] args) {
		int ganpon = 100000;
		int mai = 20000;
		int chokin = ganpon + mai;
		double rate = 1.07;
		double unyokin = 0;
		chokin = ganpon;
		unyokin = ganpon;

		for (int i = 1; i <= 10; i++) {
		chokin = chokin + ( mai * 12 );

		unyokin = (double)( ( unyokin + ( mai * 12 )) * rate);
		
		System.out.printf("%2d%s",i,"年目");
		System.out.printf("%,10d%s",chokin,"円");
		System.out.printf("%,10.0f%s\n",unyokin,"円");

		}
	}

}
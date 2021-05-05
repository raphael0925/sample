package hallojava7;

import java.math.BigDecimal;

public class expression20702 {

	public static void main(String[] args) {
		double a = 70.0;
		double aa = 90.0;
		double aaa = 10.0;
		double aaaa = 20.0;
		double b = 30.0;
		double bb = 0.0;
		double bbb = 80.0;
		double bbbb = 50.0;
		double c = 50.0;
		double cc = 45.0;
		double ccc = 90.0;
		double cccc = 5.0;

		BigDecimal A = new BigDecimal(String.valueOf(a));
		BigDecimal AA = new BigDecimal(String.valueOf(aa));
		BigDecimal AAA = new BigDecimal(String.valueOf(aaa));
		BigDecimal AAAA = new BigDecimal(String.valueOf(aaaa));
		BigDecimal B = new BigDecimal(String.valueOf(b));
		BigDecimal BB = new BigDecimal(String.valueOf(bb));
		BigDecimal BBB = new BigDecimal(String.valueOf(bbb));
		BigDecimal BBBB = new BigDecimal(String.valueOf(bbbb));
		BigDecimal C = new BigDecimal(String.valueOf(c));
		BigDecimal CC = new BigDecimal(String.valueOf(cc));
		BigDecimal CCC = new BigDecimal(String.valueOf(ccc));
		BigDecimal CCCC = new BigDecimal(String.valueOf(cccc));

//		double strengh = calStrengh(a,b,c);
		BigDecimal strengh = new BigDecimal(calStrengh(a,b,c));
		System.out.println("ヨシヒコ"+":"+strengh);
		}


}





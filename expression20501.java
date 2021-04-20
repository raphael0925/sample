package hallojava5;

public class expression20501 {

	public static void main(String[] args) {
		int total = 0;
		int[] scores = { 89,30,10,67,43,98,100,78};
		for ( int i = 0; i < scores.length; i++ ){
			total = total + scores[i];
		}
//		int average = total / scores.length;
		System.out.println( "合計:" + total );
//		System.out.println( "平均:" + average );
		System.out.println( "平均:" + (float)total / (float)scores.length );
	}

}

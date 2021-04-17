package hellojava4;

public class expression20403 {

	public static void main(String[] args) {
		String str1 = "サクサクのクッキー";
		String str2 = str1.replace("サ", "○");
		String str3 = str2.replace("キ","サ");
		String str4 = str3.replace("○", "キ");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

		//		StringBuilder sb = new StringBuilder(str2);
//		sb.replace(7,8,"サ");
//		str2 = sb.toString();
//		System.out.println(str2);	
	}

}

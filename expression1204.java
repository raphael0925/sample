package hellojava3;

import java.util.Scanner;

public class expression1204 {

	public static void main(String[] args) {
		System.out.println("あなたの名前を入力してください。");

        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        System.out.println(str+"さん、こんにちは。");

        System.out.println("あなたは、何歳ですか？");

        int num = scan.nextInt();

        System.out.println(num+"歳なんですね。よろしくお願いします。");
	}

}

package hallojava9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class expression20903 {

	public static void main(String[] args) {
		int[]number = {1,2,3};
		String[] program = {"Java","Python","JavaScript"};
		String[] type = {"コンパイラ言語","インタプリタ言語","インタプリタ言語"};
		String[] use = {"バックエンド","AI","フロントエンド"};
		exportCsv(program,type,use);
	}
	public static void exportCsv(String[] program,String[] type,String[] use) {
		try {
			FileWriter fw = new FileWriter("expression20903",false);
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));

			pw.print("プログラム言語");
			pw.print(",");
			pw.print("種類");
			pw.print(",");
			pw.print("用途");
			pw.println();

			for(int i = 0; i < number.length; i++ ) {
				pw.print(number[i]);
				pw.print(",");
				pw.print(program[i]);
				pw.print(",");
				pw.print(type[i]);
				pw.print(",");
				pw.print(use[i]);
				pw.println("");
			}

			pw.close();

			// 出力確認用のメッセージ
			System.out.println("csvファイルを出力しました");

			// 出力に失敗したときの処理
			} catch (IOException ex) {
				ex.printStackTrace();
			}
    }
}


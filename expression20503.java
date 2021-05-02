package hallojava5;

public class expression20503 {

	public static void main(String[] args) {
		char[][] koma = {
			{'○','○','○','○','○'},
			{' ' ,' ' ,'●','○',' ' },
			{' ' ,'●','○','●','●'},
			{' ' ,'●',' ' ,'●',' ' },
			{' ' ,' ' ,' ' ,' ' ,'●'}
			};
		char s = '○';
		char k = '●';
		int siro = 0;
		int kuro = 0;
		for(int i = 0; i < koma.length; i++) {
			for(int j = 0; j < koma[i].length; j++) {
				System.out.print(koma[i][j]);
				if(koma[i][j] == s) {
					siro++;
				}
				if(koma[i][j] == k) {
					kuro++;
				}

			}
			System.out.println();

		}

		if(siro>kuro) {
			System.out.println(s+siro+":"+"個");
//char宣言したs(○)が表示されない。
			System.out.println(kuro+":"+"個");
			System.out.println(siro+"の勝ち");
		}else if(siro<kuro){
			System.out.println(siro+":"+"個");
			System.out.println(kuro+":"+"個");
			System.out.println(kuro+":"+"の勝ち");
		}else if(siro==kuro) {
			System.out.println(siro+":"+"個");
			System.out.println(kuro+":"+"個");
			System.out.println("引き分け");
		}


	}

}

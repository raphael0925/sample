package hallojava7;

//import java.util.Scanner;

public class expression20701 {

	public static void main(String[] args) {
		question();
		blank();
		action();
		blank();
		action2_1();
		blank();
		action3_1();
		blank();
		action4();
		blank();
		question();
		blank();
		action2_2();
		blank();
		action3_2();
		blank();
		action4();
		}
//		Scanner scanner = new Scanner(System.in);
//		int num = scanner.nextInt();
		public static void question() {
			System.out.println("なにを飲みますか？1:コーラ　2:ポーション");
		};
		public static void action() {
			System.out.println("【玄関へ向かう】");
			System.out.println("立ち上がる");
			System.out.println("廊下を歩く");
			System.out.println("扉を開ける");			
		};
		public static void blank() {
			System.out.println();
		}
		public static void action2_1() {
			System.out.println("【買いに行く】");
			System.out.println("道を歩く");
			System.out.println("お金を入れる");
			System.out.println("飲み物を選択する");
		}
		public static void action3_1() {
			System.out.println("【戻る】");
			System.out.println("道を歩く");
			System.out.println("扉を開ける");
			System.out.println("廊下を歩く");			
		}
		public static void action4() {
			System.out.println("【飲む】");
			System.out.println("栓を開ける");
			System.out.println("飲む");
		}
		public static void action2_2() {
			System.out.println("【買いに行く】");
			System.out.println("自転車に乗る");
			System.out.println("コンビニに向く");
			System.out.println("自転車を走らせる");
			System.out.println("コンビニに入る");
			System.out.println("飲み物を選択する");
			System.out.println("レジに向かう");
			System.out.println("お金を払う");			
		}
		public static void action3_2() {
			System.out.println("【戻る】");
			System.out.println("自転車に乗る");
			System.out.println("自宅に向く");
			System.out.println("自転車を走らせる");
			System.out.println("扉を開ける");
			System.out.println("廊下を歩く");
		}

}



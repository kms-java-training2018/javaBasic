package javatraning;

public class For6_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 0; i < 10; i++) {
			System.out.print(i + ";");
			for (int j = 0 ; j < i*i; j++) {
				System.out.print("*");

			}
		System.out.println("");
		}

	}

}
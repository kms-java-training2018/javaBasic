package javatraining;

public class BinaryDigits1 {
	public static void main(String[] args) {
		// 変数設定
		int binaryDigits[] = new int[5];
		// 代入用変数
		int num = 1;
		// 初期値設定
		for (int i = 0; i < binaryDigits.length; i++) {
			binaryDigits[i] = num;
			num *= 2;
		}
		// 表示
		System.out.println("3つめの値は" + binaryDigits[2] + "です");
	}
}

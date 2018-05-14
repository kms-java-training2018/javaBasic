package javatraining;

public class BinaryDigits2 {

	public static void main(String[] args) {
		// 配列の初期化
		int[] binaryDigits = { 1, 2, 4, 8, 16 };
	
		// nつ目の値を出力する
		for (int i = 0; i < binaryDigits.length; i++) {
			System.out.println(i+1 +"つ目の値は" + binaryDigits[i] + "です。");
		}
	}
}

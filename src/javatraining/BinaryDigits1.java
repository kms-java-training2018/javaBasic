package javatraining;

public class BinaryDigits1 {

	public static void main(String[] args) {
		// 課題6-1
		final int NUM = 3;	// 取り出したい値の位置を定数で定義
		int binaryDigits[] = new int[5];
		binaryDigits[0] = 1;
		binaryDigits[1] = 2;
		binaryDigits[2] = 4;
		binaryDigits[3] = 8;
		binaryDigits[4] = 16;
		// 配列を参照するときに[NUM-1]で整合性を保っている
		System.out.println(NUM + "つ目の値は" + binaryDigits[NUM - 1] + "です。");

	}

}

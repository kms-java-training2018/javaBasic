package javatraining;

public class BinaryDigits2 {

	public static void main(String[] args) {
		//配列
				int []BinaryDigits;
				//配列
				BinaryDigits = new int [5];
				//要素
				BinaryDigits[0] = 1;
				BinaryDigits[1] = 2;
				BinaryDigits[2] = 4;
				BinaryDigits[3] = 8;
				BinaryDigits[4] = 16;
				//表示
				for (int i = 0; i < 5; i++) {
					System.out.println((i + 1) + "つ目の数字は" + BinaryDigits[i] + "です。");
				}
	}

}


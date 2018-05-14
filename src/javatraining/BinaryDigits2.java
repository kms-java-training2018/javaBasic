package javatraining;

public class BinaryDigits2 {
	public static void main(String[] args) {
		// 課題6-2
		int binaryDigits[] = new int[5];
		binaryDigits[0] = 1;
		binaryDigits[1] = 2;
		binaryDigits[2] = 4;
		binaryDigits[3] = 8;
		binaryDigits[4] = 16;
		/**
		 *  for文でまわす
		 *  
		 *  今回はi=1で初期化し配列の長さ+1を終了の基準にした
		 *  
		 *  出力する文章では配列から呼び出すときに[i-1]で整合性を保っている
		 */
		for (int i = 1; i < binaryDigits.length + 1; i++) {
			System.out.println(i + "つ目の値は" + binaryDigits[i - 1] + "です。");
		}
	}

}

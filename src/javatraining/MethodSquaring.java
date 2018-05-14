package javatraining;

public class MethodSquaring {

	public static void main(String[] args) {
		// 練習
		// 引数とする数字を格納する変数を宣言
		int num1 = 10;
		int num2 ;
		// 引数を2乗し結果を返すメソッドを呼び出す
		num2 = squaring(num1);
		// 結果を出力
		System.out.println(num2);

	}
	/**
	 * 引数を2乗し結果を返すメソッド
	 */
	public static int squaring(int n) {
		int result = n * n;
		return result;
	}

}

package javatraning;

public class MethodSquaring {

	public static void main(String[] args) {
		// 引数とする数字を格納する変数を宣言
		int i =10;
		// 引数を２乗し返すメソッドを呼び出す
		int j = squaring(i);
		// 結果を出力
		System.out.print(j);
	}

	/** 結果を二乗して返すメソッド */
	public static int squaring(int i) {
		return i*i;
	}
}

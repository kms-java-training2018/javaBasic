package javatraining;

public class MethodSquaring {
	public static void main(String[] args) {
		//引数とする数字を格納する変数を宣言
		int p, q;
		p = 20;
		q = squaring(p);
		System.out.println(q);
	}

	//引数を2乗し結果を返すメソッドを呼び出す
	public static int squaring(int p) {
		//計算して結果を返す
		return p * p;
	}
}
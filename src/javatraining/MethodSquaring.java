package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodSquaring {
	
	public static void main(String[] args) {
		// readLineメソッドを扱う準備
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// 数字の入力を求める
		System.out.println("数字を入力してください。");
		
		// コンソールに入力された文字列を格納する変数を宣言
		String line;
		
		try {
			// コンソールに入力された文字列を格納する
			line = reader.readLine();
	
			// 引数とする数字を格納する変数を宣言
			int number, answer;
		
			// 入力した文字列を数字に変換した後に、その数字を引数として格納する変数を宣言
			number = Integer.parseInt(line);

		
			// 引数を2乗し結果を返すメソッドを呼び出す。
			answer = squaring(number);
			
			// 結果を出力
			System.out.println("[" + number + "] の二乗は [" + answer + "] です。");

		} catch (IOException e) {
		e.printStackTrace();
		} catch (NumberFormatException e) {
        System.out.println("数字を入力してください。");
		}
	}
	
	/** 引数を2乗し結果を返すメソッド */
	public static int squaring (int n) {
		// 2乗に計算をして結果を返す
		return n * n;
	}
}

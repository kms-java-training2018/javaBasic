package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1 {

	public static void main(String[] args) {
		System.out.println("問題1");
		//入力用変数初期化
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			//文字用変数
			String line = "";
			for (int i = 0;i < 2;i++) {
				//一つ目の数値入力
				System.out.println((i + 1) + "つ目の整数を入力してください");
				line += reader.readLine();
				//入力された値を数値に変換し数値かどうか判定
				Integer.parseInt(line);
			}
			//表示
			System.out.println(line);
		} catch (IOException e) {
			//入力時想定外のことがおきたとき
			System.out.println(e);
		} catch (NumberFormatException e) {
			//数値入力の際数値以外を入れられたとき
			System.out.println("整数を入力してください");
		}
	}

}

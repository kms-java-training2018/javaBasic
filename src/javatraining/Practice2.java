package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice2 {

	public static void main(String[] args) {
		System.out.println("問題2");
		//入力用変数初期化
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			//バイト数入力
			System.out.println("バイト数を入力してください");
			String line = reader.readLine();
			//入力された値を数値に変換し数値かどうか判定
			int num = Integer.parseInt(line);
			//ビット数格納の後表示
			int bit = num * 8;
			System.out.println(bit + "ビット");
			//キロバイト格納の後、表示
			double kiro = (double)num * java.lang.Math.pow(10.0,-3);
			System.out.println(kiro + "キロバイト");
			//メガバイト格納の後、表示
			double mega = (double)num * java.lang.Math.pow(10.0,-6);
			System.out.println(mega + "メガバイト");
			//ギガバイト格納の後、表示
			double giga = (double)num * java.lang.Math.pow(10.0,-9);
			System.out.println(giga + "ギガバイト");
			//テラバイト格納の後、表示
			double tera = (double)num * java.lang.Math.pow(10.0,-12);
			System.out.println(tera + "テラバイト");
		} catch (IOException e) {
			//入力時想定外のことがおきたとき
			System.out.println(e);
		} catch (NumberFormatException e) {
			//数値入力の際数値以外を入れられたとき
			System.out.println("整数で入力してください");
		}

	}

}

package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));

		System.out.println("数値を入力(バイト数)");

		try {

			//数値を入力。
			String line = reader.readLine();

			//ビットを算出
			long bit = Long.parseLong(line) * 8;
			System.out.println(bit + "ビット");

			//キロバイトを算出
			double kiro = Double.parseDouble(line) / 1000L;
			System.out.println(kiro + "キロバイト");

			//メガバイトを算出
			double mega = Double.parseDouble(line) / 1000000L;
			System.out.println(mega + "メガバイト");

			//ギガバイトを算出
			double giga = Double.parseDouble(line) / 1000000000L;
			System.out.println(giga + "ギガバイト");

			//テラバイトを算出
			double tera = Double.parseDouble(line) / 1000000000000L;
			System.out.println(tera + "テラバイト");


		} catch(IOException e) {
			System.out.println(e);
		}catch(NumberFormatException e) {
			System.out.println("正しくありません");
		}

	}

}

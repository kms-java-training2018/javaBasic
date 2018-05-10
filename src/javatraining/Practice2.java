package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice2 {

	public static void main(String[] args) {
		// 2,3章 問題2

		System.out.println("入力した数値(バイト)をビット、キロバイト、メガバイト、ギガバイト、テラバイトで表示します");
		System.out.println("数値を入力してください");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = reader.readLine();
			/** 明らかに大きい桁が入るのでLong型を用意
			 * 逐一計算して表示を繰り返している
			 * 最後にまとめて表示したほうが見やすいか？
			 */
			long num = Long.parseLong(line);
			// bit
			long bit = num * 8;
			System.out.println(bit + "bit");
			// kB
			double kb = num / 1000.0;
			System.out.println(kb + "kB");
			// MB
			double mb = kb / 1000.0;
			System.out.println(mb + "MB");
			// GB
			double gb = mb / 1000.0;
			System.out.println(gb + "GB") ;
			// TB
			double tb = gb / 1000.0;
			System.out.println(tb + "TB");
		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			// 数値以外が入力された場合
			System.out.println("エラー 数値で入力してください");
		}

	}

}

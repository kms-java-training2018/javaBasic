package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Practice3 {

	public static void main(String[] args) {
		// 2,3章 問題3
		// BigDecimal利用

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
			BigDecimal num2 = BigDecimal.valueOf(num);
			// bit
			BigDecimal bit = num2.multiply(new BigDecimal("8"));
			System.out.println(bit.toPlainString() + "bit");
			// kB
			BigDecimal kb = num2.divide(new BigDecimal("1000"));
			System.out.println(kb.toPlainString() + "kB");
			// MB
			BigDecimal mb = kb.divide(new BigDecimal("1000"));
			System.out.println(mb.toPlainString() + "MB");
			// GB
			BigDecimal gb = mb.divide(new BigDecimal("1000"));
			System.out.println(gb.toPlainString() + "GB");
			// TB
			BigDecimal tb =gb.divide(new BigDecimal("1000"));
			System.out.println(tb.toPlainString() + "TB");
		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			// 数値以外が入力された場合
			System.out.println("エラー 数値で入力してください");
		}
	}

}

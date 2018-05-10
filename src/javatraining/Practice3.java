package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Practice3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));

		System.out.println("数値を入力(バイト数)");

		try {

			//数値を入力。
			String line = reader.readLine();

			//ビットを正確に算出。小数点以下を全表示
			BigDecimal data = new BigDecimal(line);
			BigDecimal hachi = BigDecimal.valueOf(8);
			BigDecimal bit = data.multiply(hachi);
			System.out.println(bit.toPlainString() + "ビット");

			//キロバイトを正確に算出。小数点以下を全表示
			BigDecimal kiro = BigDecimal.valueOf(1000);
			BigDecimal kiroByte = data.divide(kiro);
			System.out.println(kiroByte.toPlainString() + "キロバイト");

			//メガバイトを正確に算出。小数点以下を全表示
			BigDecimal mega = BigDecimal.valueOf(1000000);
			BigDecimal megaByte = data.divide(mega);
			System.out.println(megaByte.toPlainString() + "メガバイト");

			//ギガバイトを正確に算出。小数点以下を全表示
			BigDecimal giga = BigDecimal.valueOf(1000000000);
			BigDecimal gigaByte = data.divide(giga);
			System.out.println(gigaByte.toPlainString() + "ギガバイト");

			//テラバイトを正確に算出。小数点以下を全表示
			BigDecimal tera = BigDecimal.valueOf(1000000000000L);
			BigDecimal teraByte = data.divide(tera);
			System.out.println(teraByte.toPlainString() + "テラバイト");



		} catch(IOException e) {
			System.out.println(e);
		}catch(NumberFormatException e) {
			System.out.println("正しくありません");
		}

	}

}

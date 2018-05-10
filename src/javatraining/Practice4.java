package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Practice4 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));

		System.out.println("時間を入力してください");

		try {

			//数値を入力。
			String line = reader.readLine();

			//秒に正しく変換。
			BigDecimal data = new BigDecimal(line);
			BigDecimal x = BigDecimal.valueOf(3600);
			BigDecimal byou = data.multiply(x);
			System.out.println(byou + "秒");

			//分に正しく変換
			BigDecimal y = BigDecimal.valueOf(60);
			BigDecimal hun = data.multiply(y);
			System.out.println(hun + "分");

			//人日に正しく変換
			BigDecimal z = BigDecimal.valueOf(8);
			BigDecimal ninnichi = data.divide(z);
			System.out.println(ninnichi + "人日");

			//人月に正しく変換
			BigDecimal s = BigDecimal.valueOf(160);
			BigDecimal ningetsu = data.divide(s);
			System.out.println(ningetsu + "人月");

		} catch(IOException e) {
			System.out.println(e);
		}catch(NumberFormatException e) {
			System.out.println("正しくありません");
		}
	}
}

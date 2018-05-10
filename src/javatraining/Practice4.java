package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Practice4 {

	public static void main(String[] args) {
		// 2,3章 問題4
		// BigDecimal利用

		System.out.println("入力した時間を秒、分、人日、人月に変換します");
		System.out.println("時間を入力してください");
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = read.readLine();
			// 小数も想定してdouble型にした（intでよかった気がする）
			double time = Double.valueOf(line);
			// BigDecimalに変換
			BigDecimal time2 = BigDecimal.valueOf(time);
			/**
			 * ひたすら計算
			 * 人日は8時間あたり
			 * 人月は20日で計算しています
			 */
			BigDecimal day = time2.divide(new BigDecimal("8"));
			BigDecimal month = day.divide(new BigDecimal("20"));
			BigDecimal min = time2.multiply(new BigDecimal("60"));
			BigDecimal sec = min.multiply(new BigDecimal("60"));
			// 順に表示します
			System.out.println(sec.toPlainString() + "秒");
			System.out.println(min.toPlainString() + "分");
			System.out.println(time2.toPlainString() + "時間");
			System.out.println(day.toPlainString() + "人日");
			System.out.println(month.toPlainString() + "人月");
		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			// 数値以外が入力された場合
			System.out.println("エラー 数値で入力してください");
		}

	}

}
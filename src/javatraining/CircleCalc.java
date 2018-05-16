package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircleCalc {

	public static void main(String[] args) {
		// 本日の課題
		/**
		 * 宣言
		 */
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		double r;
		/**
		 * 入力
		 */
		System.out.println("入力した半径の円と半径10の円を用いて\nふたつの円の面積、円周の和を表示します");
		System.out.println("数値を入力してください");
		try {
			String line = reader.readLine();
			r = Double.parseDouble(line);
			Circle c1 = new Circle();
			Circle c2 = new Circle(r);
			System.out.println("ふたつの円の面積の和は" + (c1.getArea() + c2.getArea()));
			System.out.println("ふたつの円の円周の和は" + (c1.getCircumference()+ c2.getCircumference()));
		} catch (IOException e) {	// 想定外のエラー
			System.out.println(e);

		} catch (NumberFormatException e) {	// 数値以外を入力したエラー
			System.out.println("数値を入力してください");

		}

	}

}

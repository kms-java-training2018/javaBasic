package javatraning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircleCalc {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("半径の値を入力してください");
		try {

			//半径の値を代入
			String read = reader.readLine();
			int x = Integer.parseInt(read);


			//Circleクラスから計算を引っ張る
			Circle y = new Circle(x);
			System.out.println("円周の和　＝ " + y.getFerence());
			System.out.println("円周の和　＝ " + y.getArea());

		} catch (IOException e) {

		}

	}

}

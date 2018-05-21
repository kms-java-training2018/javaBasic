package javatraning;

import java.util.ArrayList;
import java.util.Random;

public class ListPractice {

	public static void main(String[] args) {
		//代入するListを定義
		ArrayList<Integer> list = new ArrayList<Integer>();
		//10個入れられるまでのloop
		int a = 0;
		while (a < 10) {
			//0~99のランダムな値をintに出力する
			Random rand = new Random();
			int cpu = rand.nextInt(100);

			//出力した時に、そのintを配列全てと比較
			if (list.contains(cpu)) {
				//被っていたら、配列に代入しない

			} else {
				//重複しないなら、配列に代入する
				list.add(cpu);

				//デバッグ用処理毎に代入した値を要素番号と共に表示
				System.out.println("要素番号"+a+"：" + cpu);
				a = a + 1;
			}
		}

		/**	いらないやつ
		//10個入れられたら一覧表示
		for (Integer x : list) {
			System.out.print(x);
			System.out.print(",");
		}
		*/
		System.out.println("");

		//最大値と最小値を出力
		//最大値の変数maxを定義
		int max = 0;
		//要素番号の変数num1
		int num1 = 0;
		for (Integer x : list) {
			if (max < x) {
				max = x;
			} else {
			}
		}
		/**
		//最小値の変数minimum
		int minimum = 99;
		//要素番号の変数num2
		int num2 = 0;
		for (Integer x : list) {
			if (minimum > x) {
				minimum = x;
			} else {
			}
		}*/
		//最大値、最小値の要素番号を各要素番号変数に代入
		num1 = list.indexOf(max);
		/**num2 = list.indexOf(minimum);*/

		//最大値の表示
		System.out.println("最大値の要素番号：" + num1);
		System.out.println("最大値：" + max);

		/**
		//最小値の表示
		System.out.println("最小値の要素番号：" + num2);
		System.out.println("最小値：" + minimum);*/

	}

}

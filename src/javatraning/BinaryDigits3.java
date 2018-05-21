package javatraning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryDigits3 {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {

			int score[] = new int[5];
			String inline[] = new String[5];
			//５人までの繰り返し
			for (int i = 0; i < score.length; i++) {

				//○人目の変数
				int j = i + 1;

				//入力しなおすかどうかのためのフラグ
				int x = 0;

				//入力値が整数じゃない場合のためのwhile
				while (x < 1) {
					try {
						System.out.println(j + "人目の点数を入力してください");

						//読み取った値を配列に代入
						inline[i] = reader.readLine();
						score[i] = Integer.parseInt(inline[i]);

						//○人目のスコア表示
						System.out.println(j + "人目の点数は" + score[i]);

						//whileを抜け出すためのフラグ設定
						x = 1;
					} catch (NumberFormatException e) {
						System.out.println("0~99を入力して！次を入力！");
					}
				}

			}
			//平均計算用の変数を設定
			int sum = 0;
			double average = 0;

			//平均計算のためのfor文
			for (int i = 0; i < score.length; i++) {
				sum += score[i];

			}
			average = sum / score.length;

			//計算結果の表示
			System.out.println("５人の平均点は" + average);

		} catch (IOException e) {

		}

	}
}
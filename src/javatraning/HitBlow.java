package javatraning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class HitBlow {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		/**
		 手順整理
		 ランダムの数値配列を作成
		 入力された数値を配列に代入
		 入力配列の数値をランダム配列と順番に比較
		 数値が一致し、なおかつindexが合致していれば、hit
		 数値が一致のみの場合は、blow
		 */

		//繰り返しプレイのためのwhile
		while (true) {

			//問題文の表示
			System.out.println("ランダムの3桁の数字を当てよう");
			System.out.println("それぞれ桁の数字は被らない数字となっている");

			//3桁ランダム用のListを定義
			ArrayList<Integer> rundumList = new ArrayList<Integer>();

			//3個入れられるまでのloop
			int a = 0;
			while (a < 3) {

				//1~9のランダムな値をintに出力する
				Random rand = new Random();
				int cpu = rand.nextInt(9) + 1;

				//出力した時に、そのintを配列全てと比較
				if (rundumList.contains(cpu)) {
					//被っていたら、配列に代入しない

				} else {
					//重複しないなら、配列に代入する
					rundumList.add(cpu);

					//デバッグ用処理毎に代入した値を要素番号と共に表示
					//System.out.println("要素番号" + a + "：" + cpu);
					a = a + 1;
				}
			}

			//クリアターン用の変数
			int turn = 0;
			int x = 0;
			while (x < 1) {
				try {


					//3つの数字の入力を待つ

					//1つめ
					System.out.println("1つめの数字を入力");
					String line = reader.readLine();
					int num1 = Integer.parseInt(line);

					//2つめ
					System.out.println("2つめの数字を入力");
					line = reader.readLine();
					int num2 = Integer.parseInt(line);

					//3つめ
					System.out.println("3つめの数字を入力");
					line = reader.readLine();
					int num3 = Integer.parseInt(line);

					//代入するListを定義
					ArrayList<Integer> plList = new ArrayList<Integer>();
					plList.add(num1);
					plList.add(num2);
					plList.add(num3);

					//hitの数変数count
					int hit = 0;
					//blowの変数
					int blow = 0;

					//1つ目の判定

					for (int p = 0; p < 3; p++) {
						for (int q = 0; q < 3; q++) {


							if (rundumList.get(q) == plList.get(p) && q == p) {
								hit = hit + 1;

							} else if (rundumList.get(q) == plList.get(p)) {
								blow = blow + 1;
							}


						}
					}

					//hitとblowを表示
					System.out.println("hitの数　：" + hit);
					System.out.println("blowの数　：" + blow);
					if (hit == 3) {
						System.out.println("お見事！正解！");
						System.out.println("クリアターン："+ turn);
						x = 1;

					} else {
						System.out.println("残念！もう一度");
						turn = turn + 1;
					}

				} catch (IOException e) {

				} catch (NumberFormatException e) {
					System.out.println("整数を入力してなー＾＾");

				}

			}
			//もう一度プレイするかの入力判定
			System.out.println("もう一度する？");
			System.out.println("する→ 1 しない→それ以外");
			try {

				String line = reader.readLine();
				int read1 = Integer.parseInt(line);
				if (!(read1 == 1)) {
					break;
				}

			} catch (IOException e) {

			}

		}
	}

}

package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryDigits3 {

	public static void main(String[] args) {
		//------------------------------------------
		// 変数設定
		//------------------------------------------
		// 得点
		int score[] = new int[5];
		// 点数の合計
		int sum = 0;
		// 入力用変数
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			// 得点を入力する
			for (int i = 0; i < score.length; i++) {
				// 得点を入力する
				System.out.println((i + 1) + "つめの得点を入力してください");
				score[i] = Integer.parseInt(reader.readLine());
				// 合計に追加していく
				sum += score[i];
			}
			// 点数を表示する
			for (int i = 0; i < score.length; i++) {
				// 得点を出力する
				System.out.println((i + 1) + "人目:"+ score[i] + "点");
			}
			// 平均点を表示する
			System.out.println("班の平均点は" + ((double)sum / score.length) + "点");
		} catch (IOException e) {
			//入力時想定外のことがおきたとき
			System.err.println("エラー : 想定外の入力がされました");
			System.err.println(e);
		} catch (NumberFormatException e) {
			//数値入力の際数値以外を入れられたとき
			System.err.println("エラー : 不正な値が入力されました");
			System.err.println(e);
		}
	}

}

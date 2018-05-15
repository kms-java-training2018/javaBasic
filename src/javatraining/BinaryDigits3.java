package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryDigits3 {

	public static void main(String[] args) {
		// 5/15オリジナルな課題そのいち
		/**
		 * 5回整数を入力することが出来(毎回「○人目の点数を入力して下さい。」と出力されること)、
		その入力値をscoreに格納していき
		5回入力された時点で
		「1人目：○点」というように
		:
		「5人目：○点」
		「班の平均点は○点です。」
		
		と出力せよ。また整数以外の入力があった場合は点数の出力は行わず、「不正な値が入力されま
		した。」と出力すること。
		 */
		/**
		 * 宣言
		 */
		int[] score = new int[5]; // 各々の点数入れる配列
		int sum = 0; // 平均計算用に合計していく変数
		final int MAX_INT = 5; // 繰り返す回数の定数。今回の課題では5回
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // おなじみ入力用
		/**
		 * 入力処理
		 */
		System.out.println("班の構成員の点数を自然数で順に入力してください");
		for (int i = 0; i < MAX_INT; i++) {
			try {
				System.out.println((i + 1) + "人目の点数を入力してください");
				String line = reader.readLine();
				score[i] = Integer.parseInt(line);
				sum += Integer.parseInt(line);
				if (score[i] < 0) { // マイナス入力してもエラー終了にしました
					System.out.println("不正な値が入力されました");
					System.exit(0); // エラー終了
				}
			} catch (IOException e) { // 想定外のエラー
				System.out.println(e);
			} catch (NumberFormatException e) { // 整数以外が入力された場合
				System.out.println("不正な値が入力されました");
				System.exit(0); // エラー終了
			}
		}
		/**
		 * 出力
		 */
		for (int i = 0; i < score.length; i++) { // MAX_INTでもよかったが配列の長さにしてみた
			System.out.println((i + 1) + "人目の点数 : " + score[i] + "点"); // 各々の点数出力
		}
		System.out.println("班の平均点は" + (sum / score.length) + "点です。"); // 平均点出力

	}

}

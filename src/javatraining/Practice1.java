package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1 {

	public static void main(String[] args) {
		// 2,3章課題 問題1
		System.out.println("ひとつめに入力した数値とふたつめに入力した数値を文字列として連結\nコンソール上に表示します");
		System.out.println("ひとつめの数値を入力してください");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String hitotume = reader.readLine();
			// 数値以外をはじくため判定用の変数を用意
			int hantei = Integer.parseInt(hitotume);
			System.out.println(hantei + "は数値なので処理を続行します");
			System.out.println("ふたつめの数値を入力してください");
			String hutatume = reader.readLine();
			hantei = Integer.parseInt(hutatume);
			System.out.println(hantei + "は数値なので処理を続行します");
			System.out.println("ふたつの数値を連結して表示します");
			// String型のままなので加算されない
			System.out.println(hitotume + hutatume);
		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			// 数値以外が入力された場合
			System.out.println("エラー 数値で入力してください");
		}
	}

}

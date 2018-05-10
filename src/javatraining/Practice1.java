package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author mitsuno-shinki
 *
 */
public class Practice1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));

		System.out.println("一つ目の数値を入力");

		try {

			//一つ目の数値を入力
			String ichi = reader.readLine();

			//二つ目の数値を入力
			System.out.println("二つ目の数値を入力");
			String Ni = reader.readLine();

			//一つ目と二つ目の数値(文字列)を足して、出力
			System.out.println(ichi + Ni);


		} catch(IOException e) {
			System.out.println(e);
		}catch(NumberFormatException e) {
			System.out.println("正しくありません");
		}

	}

}

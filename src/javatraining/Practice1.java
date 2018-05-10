package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1 {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		try {
			String line;
			//1つ目数値入力
		     System.out.println("1つ目の数値を入力してください。");
             line = reader.readLine();
             String word1 = line;

		     //2つ目の数値を入力
		     System.out.println("2つ目の数値を入力してください。");
		     line = reader.readLine();
             String word2 = line;

		     //文字列として連結、表示
		     System.out.println("文字列として連結します。");
		     System.out.println(word1 + word2);

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}





}
}

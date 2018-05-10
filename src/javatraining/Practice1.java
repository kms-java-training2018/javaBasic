package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 変数の宣言
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            // 変数の宣言
            String suuji1;
            String suuji2;
            // 1つ目の数字入力
            System.out.println("1つ目の数値を入力してください");
            suuji1 = reader.readLine();
            // 2つ目の数字入力
            System.out.println("2つ目の数値を入力してください");
            suuji2 = reader.readLine();
            // 連結させて表示させる
            System.out.println(suuji1 + suuji2);
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数値を入力してください");
        }
	}

}

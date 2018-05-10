package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));

		try {
		String line;
		//1回目
		System.out.println("数値を入力してください");
		line = reader.readLine();
		String A = line;

		//2回目
	    System.out.println("数値を入力してください");
	    line = reader.readLine();
		String B = line;

		System.out.println(A+B);

		}catch (IOException e) {
       	 System.out.println(e);
        }catch (NumberFormatException e) {
       	 System.out.println("正しくありません");

        }
	}
}

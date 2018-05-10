package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			string line;
			//1つめ
			System.out.println("1つめの値を入力してください。");
			String number1 = reader.readLine();
			//2つめ
			System.out.println("2つめの値を入力してください。");
			String number2 = reader.readLine();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
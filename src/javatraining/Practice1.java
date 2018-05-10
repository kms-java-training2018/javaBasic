package javatraining;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practice1 {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			try {
				//1
				System.out.println("数値を入力してください。");
				String Number1 = reader.readLine();
				//2
				System.out.println("数値を入力してください。");
				String Number2 = reader.readLine();
				//足す
				System.out.println(Number1 + Number2);
			}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
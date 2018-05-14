package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberHit {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i = (int) (Math.random() * 100);

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			int j = -1;
			while (i != j) {
				System.out.println("数をあててね。");
				j = Integer.parseInt(reader.readLine());
				if (i != j) {
					if (j >= 0 && j < 100) {
						if (i < j) {
							System.out.println("残念！もっと小さな数字です。");
						} else if (j < i) {
							System.out.println("残念！もっと大きな数字です。");
						}
					} else {
						System.out.println("有効な数字を入れてください。");
					}
				}
			}
			System.out.println("当ったりー");
		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字を入れてください。");
		}
	}
}

package javatraining;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {

			//1つ
			System.out.println("1つ目の数字を入力してください");
			String number1 = reader.readLine();
			number1 = String.valueOf(number1);

			//2つ
			System.out.println("2つ目の数字を入力してください");
			String number2 = reader.readLine();
			number2 = String.valueOf(number2);
			
			//数値じゃないのを弾く
			System.out.println(number1 + number2);
			}catch (IOException e) {
				System.out.println(e);
			}catch (NumberFormatException e) {
				System.out.println("数値ではありません");
			}
	}
}

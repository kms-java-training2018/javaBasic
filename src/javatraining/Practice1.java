package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1 {
    public static void main(String[] args) {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	try {
    	//一つ目入力
		System.out.println("一つ目の数値を入力してください。");
		String number1 = reader.readLine();
		int x = Integer.parseInt(number1);
		//二つ目入力
		System.out.println("二つ目の数値を入力してください。");
		String number2 = reader.readLine();
		int y = Integer.parseInt(number2);
		//連結
		System.out.println(x+""+y);
    	} catch (IOException e) {
    		System.out.println(e);
    	} catch (NumberFormatException e) {
    		System.out.println("数値が正しくありません。");
    	}
    }
}







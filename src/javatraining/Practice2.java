package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice2 {

	public static void main(String[] args) {
		System.out.println("バイト数を入力してください。");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    try {
	    	String line = reader.readLine();  //バイトの数値を取得
	    	long a = Integer.parseInt(line);
	    	double bit = a * 8;  //バイトをビットに変換して"bit"に代入
	    	double KB = a / 1000;  //バイトをキロバイトに変換して"bit"に代入
	    	double MB = KB / 1000;  //キロバイトをメガバイトに変換して"bit"に代入
	    	double GB = MB / 1000;  //メガバイトをギガバイトに変換して"bit"に代入
	    	double TB = GB / 1000;  //ギガバイトをテラバイトに変換して"bit"に代入
	    	System.out.println(a + " バイトは " + bit + " ビットです。");
	    	System.out.println(a + " バイトは " + KB + " キロバイトです。");
	    	System.out.println(a + " バイトは " + MB + " メガバイトです。");
	    	System.out.println(a + " バイトは " + GB + " ギガバイトです。");
	    	System.out.println(a + " バイトは " + TB + " テラバイトです。");
	    } catch (IOException e) {
	    	System.out.println(e);
	    } catch (NumberFormatException e) {
	    	System.out.println("数値が正しくありません。");
	    }
	}

}

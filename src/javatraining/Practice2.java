package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 問題2
 * コンソール上から入力した数値(バイト数)をビット、キロバイト、ギガバイト、テラバイト
 * の単位に計算してそれぞれコンソール上に表示せよ。
 */

public class Practice2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("数値を入力してください");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line;
			
			// 入力
			line = reader.readLine();
			
			// 計算
			// bit
			int bit = Integer.parseInt(line);
			bit = bit * 8;
			
			// kb
			double kb = Integer.parseInt(line);
			kb = kb / 1000;
			
			// mb
			double mb = Integer.parseInt(line);
			mb = mb / 1000000L;
			
			// gb
			double gb = Integer.parseInt(line);
			gb = gb / 1000000000L;
			
			// tb
			double tb = Integer.parseInt(line);
			tb = tb / 1000000000000L;
			
			// 画面表示
			System.out.println(bit + "ビット");
			System.out.println(kb + "キロバイト");
			System.out.println(mb + "メガバイト");
			System.out.println(gb + "ギガバイト");
			System.out.println(tb + "テラバイト");
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}

}

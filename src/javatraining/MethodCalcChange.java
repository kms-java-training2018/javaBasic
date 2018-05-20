package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodCalcChange {
	public static void main(String[] args) {
		// 定価、支払額を入力
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("teika");
			String line = reader.readLine();
			int teika = Integer.parseInt(line);
			System.out.println("shiharai");
			line = reader.readLine();
			int shiharai = Integer.parseInt(line);
			System.out.println(MethodCalcTax(teika, shiharai));
		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字の形式が正しくありません。");
		}
	}

	// 定価、支払額を引数として渡し、定価に消費税を加えて支払額から引きおつりを出すメソッドを呼び出す
	public static int MethodCalcTax(int p, int q) {
		double urine = p + p * 0.08;
		int otsuri = (int) (q - urine);
		// 結果を出力
		return otsuri;
	}
}
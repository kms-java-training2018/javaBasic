package javatraning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodCalcChange {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		//正しくお釣りまで表示されたかフラグ
		int end = 0;
		while (end <= 0) {
			try {
				// 定価の入力
				System.out.println("定価を入力してください。");
				String read = reader.readLine();
				// listPriceに読み取った金額を代入
				int price = Integer.parseInt(read);

				//定価が０以上の金額であるかチェック
				if (price < 0) {
					System.out.println("正しい定価を入力してください。");
				}

				// 支払額の入力
				System.out.println("支払額を入力してください。");
				String priceTwo = reader.readLine();
				//paymentに読み取った金額を代入
				int payment = Integer.parseInt(priceTwo);

				//支払い額が０以上の金額であるか、定価以上であるかチェック
				if (payment < 0) {
					System.out.println("正しい定価を入力してください。");
				}

				// MethodCalcTaxを呼び出す
				int change = MethodCalcTax(price, payment);

				//支払額が不足してないかのif
				if (change > 0) {
					// お釣りの表示
					System.out.println("お釣りは" + change + "円");
					end = 1;
				} else
					System.out.println(change + "円不足しています。");

			} catch (IOException e) {

			} catch (NumberFormatException e) {
				System.out.println("金額が正しくありません");
			}
		}

	}

	/** 入力された定価から消費税をプラスして売値を出す*/
	public static int MethodCalcTax(int price, int payment) {
		//引数として受け取った定価に消費税を加えて売価を出す
		double price2 = price * 1.08;
		int sellPrice = (int) price2;

		//売値を表示させる
		System.out.println("売価は" + sellPrice + "円");

		//引数として受け取った支払額から、上記売価を引く
		int change1 = payment - sellPrice;

		//支払い額－売価＝お釣りのテキスト表示
		System.out.println("支払額(" + payment + "円) － 売価(" + sellPrice + "円)＝" + change1 + "円");

		//戻り値はお釣り
		return change1;

	}

}

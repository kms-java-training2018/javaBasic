package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodCalcChange {

	public static void main(String[] args) {
		// 練習問題
		System.out.println("定価と支払額を入力するとおつりを計算します");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int check = 0; // チェックフラグ
		int plice = 0; // 定価
		int change = 0; // 支払額
		int calc = 0; // 計算結果
		// 定価、支払額入力
		try {
			while (check != 1) {
				System.out.println("定価を入力してください");
				String line = reader.readLine();
				plice = Integer.parseInt(line);
				System.out.println("支払額を入力してください");
				line = reader.readLine();
				change = Integer.parseInt(line);
				// 定価と支払額チェック
				// マイナスはじく
				if (plice < 0 || change < 0) {
					System.out.println("金額は正の数で入れてください");
				} else {
					// 定価と支払大小比較
					if (plice > change) {
						System.out.println("支払額は定価より大きくしてください");
					} else {
						// すべて問題なければチャックフラグオンでwhile抜ける
						check = 1;
					}
				}

			}
			/**
			 *  定価、支払額を引数として渡し、
			 *  定価に消費税を加えて支払額から引きおつりを出すメソッドを呼び出す
			 */
			calc = MethodCalcTax(plice, change);
			if (calc < 0) {
				// 支払額不足の場合
				calc = -calc;
				System.out.println(calc + "円不足しています");
			} else {
				// 支払が足りていた場合
				// 結果を出力
				System.out.println("おつりは" + calc + "円です");
			}

		} catch (IOException e) {
			// 想定外のエラー
			System.out.println(e);
		} catch (NumberFormatException e) {
			// 数値以外を入力した場合
			System.out.println("整数の数値を入力してください");
		}

	}

	/**
	 *  定価、支払額を引数として渡し、
	 *  定価に消費税を加えて支払額から引きおつりを出すメソッド
	 *  定数TAXで消費税を表記
	 */
	public static int MethodCalcTax(int plice, int change) {
		final double TAX = 1.08;
		// 引数として受け取った定価に消費税を加えて売値を出す
		int calc = (int) (plice * TAX);
		System.out.println("税込み" + calc + "円です");
		// 引数として受け取った支払額から、上記売値を引く
		return calc = change - calc;
	}

}
package javatraning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MapPractice {

	public static void main(String[] args) {
		//MapとしてHashMapのインスタンスを確保する
		Map<String, String> map = new HashMap<String, String>();

		//入力の繰り返しフラグ
		int i = 0;
		while (i < 1) {

			//キーと値のペアを追加
			//キー：日本球団名、値：英語

			map.put("阪神", "Tigers");
			map.put("巨人", "Giants");
			map.put("広島", "Carp");
			map.put("横浜", "BayStars");
			map.put("ヤクルト", "Swallows");
			map.put("中日", "Dragons");

			map.put("福岡", "Hawks");
			map.put("ロッテ", "Marines");
			map.put("西武", "Lions");
			map.put("オリックス", "Buffaloes");
			map.put("日本ハム", "Fighters");
			map.put("楽天", "Eagles");

			//日本語の球団名を入力させる
			System.out.println("日本のプロ野球の球団名を日本語で入力してください");
			System.out.println("入力可能項目は以下の通りです");

			//キー拡張に関するforループ
			for (String name : map.keySet()) {
				System.out.print(name);
				System.out.print(",");
			}
			System.out.println("");

			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

				//入力を読み取る
				System.out.println("");
				String line = reader.readLine();
				System.out.println("入力された球団名 :" + line);

				//対応するチーム名があるときだけ表示
				//なかった場合はテキスト表示

				//表示
				if (map.containsKey(line)) {
					System.out.println("対応するチーム名　:" + map.get(line));

				} else {
					System.out.println("対応するチーム名がありません");
				}

				//検索終了か否かの入力
				System.out.println("検索を終了しますか？");
				System.out.println("する場合→1を入力、しない場合→それ以外を入力");

				String line2 = reader.readLine();
				int answer = Integer.parseInt(line2);

				if (answer == 1) {

				} else {
					i = 1;
					System.out.println("検索終了");
				}

			} catch (

			IOException e) {
				System.out.println(e);

			} catch (NumberFormatException e) {
				System.out.println("検索終了");
				i = 1;
			}

		}

	}

}

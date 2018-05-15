package javatraining;

public class SelectGreeting {

	public static void main(String[] args) {
		// 変数設定
		// メッセージ内容
		String[] message = {
				"おはよう！",
				"こんにちは！",
				"こんばんは！",
		};

		// 何も送られていないもしくは
		// 二文字以上が送られてきたとき
		if (args.length != 1) {
			// 表示
			System.out.println("使い方 : java SelectGreeting 番号");
			// 終了
			System.exit(0);
		}
		// 一文字目を数値に変換
		int num = Integer.parseInt(args[0]);
		// 数値によって表記を変更
		if (0 <= num && num < message.length) {
			System.out.println(message[num]);
		} else {
			System.out.println("番号は0～" + (message.length - 1) + "の範囲で指定してください。");
		}
	}

}

package javatraining;

public class SelectGreeting {
	public static void main(String[] args) {
		String[] message;
		// 出力する文字を入力
		message = new String[3];
		message[0] = "おはよう！";
		message[1] = "こんにちは！";
		message[2] = "こんばんは！";
		if (args.length != 1) {
			System.out.println("使い方 : java SelectGreeting 番号");
			System.exit(0);
		}
		// 番号の範囲指定を行う
		int num = Integer.parseInt(args[0]);
		if (0 <= num && num < message.length) {
			System.out.println(message[num]);
		} else {
			System.out.println("番号は0～" + 2 + "の範囲で指定してください。");
		}
	}
}
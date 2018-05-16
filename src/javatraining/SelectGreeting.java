package javatraining;

public class SelectGreeting {

    public static void main(String[] args) {
        // 238p 9-6
        String[] message = { "おはよう！", "こんにちは！", "こんばんは！" };	// 配列を文字列で初期化

        if (args.length != 1) {
            System.out.println("使い方:java SelectGrreting 番号");
            System.exit(0);
        }
        int num = Integer.parseInt(args[0]);	// 配列を参照するための引数を代入
        if (0 <= num && num < message.length) {
            System.out.println(message[num]);
        } else {
            System.out.println("番号は0～" + (message.length - 1) + "の範囲で指定してください");
            // 配列は[0]から始まるのでmessageの文字数-1にする
        }

    }

}

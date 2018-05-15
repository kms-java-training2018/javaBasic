package javatraining;

/**
 *
 * 【pp238-9　問題9-6】
 * 番号指定のあいさつプログラム
 *
 * @author iyo-marina
 *
 */

public class SelectGreeting {

    public static void main(String[] args) {

        // String型配列messageを宣言し、サイズを3に決定
        String[] message = new String[3];

        // 配列messageに文字列を代入
        message[0] = "おはよう！";
        message[1] = "こんにちは！";
        message[2] = "こんばんは！";

        // プログラム実行時の引数の個数が1つ以外だった場合、
        // 使い方を表示してプログラム終了
        // ※このプログラムは、実行時の引数を1つのみ受け付ける
        if (args.length != 1) {
            System.out.println("使い方：java SelectGreeting 番号");
            System.exit(0);
        }

        // 実行時の引数1つをint型に変換
        int num = Integer.parseInt(args[0]);

        // 実行時引数の値を元に、配列message内の文字列を表示
        if (0 <= num && num < message.length) {
            System.out.println(message[num]);
        } else {
            System.out.println("番号は0～" + (message.length - 1) +"の範囲で指定してください。");
        }
    }

}

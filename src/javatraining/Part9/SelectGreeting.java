package javatraining.Part9;

public class SelectGreeting {

    /*
     * 問題9-6
     * 実行の構成から数値を入力し、その数値に対応したあいさつの出力
     */

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        String[] message = { "おはよう！", "こんにちは", "こんばんは！" };
        // 文字配列の初期化と代入

        if (args.length != 1) {
            // 引数が1文字であるか
            System.out.println("使い方 : java SelectGreeting 番号");
            System.exit(0);
            // プログラムの終了
        }
        int num = Integer.parseInt(args[0]);
        // 入力された文字列の整数化
        if (0 <= num && num < message.length) {
            // 入力された数値が正しいかどうか
            System.out.println(message[num]);
        } else {
            System.out.println("番号は0～" + (message.length - 1) + "の範囲で指定してください。");
        }
    }

}
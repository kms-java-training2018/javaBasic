package javatraining;

/**
 * テキスト課題9-6
 * 番号指定のあいさつプログラム
 */

public class SelectGreeting {

    public static void main(String[] args) {

        //配列を定義
        String[] message = new String[3];

        //あいさつを格納
        message[0] = "おはよう！";
        message[1] = "こんにちは！";
        message[2] = "こんばんは！";

        //引数が空欄の場合と数字を複数入力した場合
        if (args.length != 1) {

            //入力を促す
            System.out.println("使い方：java SelectGreeting 番号");

            //正常終了
            System.exit(0);
        }

        //引数の一番目をint型に変換
        int num = Integer.parseInt(args[0]);

        //引数の一番目が0以上3未満の時
        if (0 <= num && num < message.length) {

            //あいさつを出力
            System.out.println(message[num]);
        } else {

            //0～2個でない場合にエラー表示
            System.out.println("番号は0～" + 2 + "の範囲で指定してください。");
        }
    }

}

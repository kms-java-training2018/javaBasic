package javatraining;

/**
*
* 2018/05/15
* 三野進紀
* 9章 配列
* 問題9_6 穴埋め問題
* 番号指定のあいさつプログラム
*
* */

public class SelectGreeting {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        //String型で配列を宣言
        /**実行結果から挨拶の種類が3つあるので、配列の長さを3に設定*/
        String[] message = new String[3];

        /**それぞれの値に挨拶を代入*/
        message[0] = "おはよう！";
        message[1] = "こんにちは！";
        message[2] = "こんばんは！";

        //入力した値の長さが1ではない場合、使い方を表示してプログラム終了
        if (args.length != 1) {
            System.out.println("使い方：java SelectGreeting 番号");
            System.exit(0);

        }

        /**入力した一つ目の値をint型に変更*/
        int num = Integer.parseInt(args[0]);

        //打ち込んだ数値が配列messageの範囲内であるならば、その値と対応している挨拶を出力
        if (0 <= num && num < message.length) {
            System.out.println(message[num]);

        } else { //それ以外
            //範囲内で入力してくださいを出力
            System.out.println("番号は0～" + (message.length - 1) + "の範囲で入力してください");
        }

    }

}

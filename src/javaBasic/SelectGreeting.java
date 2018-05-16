package javaBasic;

/**
 * 問題9-6
 * テキストpp.238-239.
 */
public class SelectGreeting {
    public static void main(String[] args) {

        //あいさつが格納される配列(message)を宣言、メモリを確保
        String[]message = new String[3];

        //配列の要素にあいさつ文を代入する
        message[0] = "おはよう!";
        message[1] = "こんにちは!";
        message[2] = "こんばんは!";

        //コマンドラインの引数の長さが1以外だった場合のエラーを設定
        if(args.length !=1) {
            System.out.println("使い方:java SelectGreeting 番号");
            System.exit(0);
        }

        //コマンドラインの引数を格納する変数numを宣言
        int num = Integer.parseInt(args[0]);

        //コマンドラインの引数に対応するあいさつ文を表示する
        if (0 <= num && num < message.length) {
            System.out.println(message[num]);
        } else {
            System.out.println("番号は0～" + (message.length - 1) + "の範囲で指定してください。");
        }
    }
}

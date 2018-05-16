package javatraining;

public class SelectGreeting {
    // 問題9-6
    public static void main(String[] args) {
        // String型の配列messageの宣言
        String[] message = {
                "おはよう!",
                "こんにちは!",
                "こんばんは!"
        };

        // String型の配列argsの長さが1以外の場合
        if (args.length != 1) {
            // コンソールに出力
            System.out.println("使い方: java SelectGreenting 番号");
            // プログラムの正常終了
            System.exit(0);
        }

        // 配列argsの1つ目の要素の値をint型にする
        int num = Integer.parseInt(args[0]);

        // 変数numの値が0以上かつ配列messageの長さ未満の場合
        if (0 <= num && num < message.length) {
            // 配列messageの(変数numの値)番目の要素をコンソールに出力
            System.out.println(message[num]);
        // それ以外の場合
        } else {
            // コンソールに出力
            System.out.println("番号は0～" + (message.length-1) + "の範囲で指定してください。");
        }
    }

}

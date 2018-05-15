package javatraining;

/**
 * 教科書　上　p.238
 * 問題9-6
 * 「番号指定の挨拶プログラムを完成させましょう」
 * */
public class SerectGreeting {

    public static void main(String[] args) {
        String[] message = { //表示させる内容を配列に入れる。
                "おはよう！",
                "こんにちは！",
                "こんばんは！"
        };
        if (args.length != 1) { //番号の指定がない場合or複数の番号が指定された場合。
            System.out.println("使い方： java selectGreeting 番号");
            System.exit(0);
        }
        int num = Integer.parseInt(args[0]); //指定された番号をint型変数numに代入。
        /*
         * 指定された番号が0以上要素の数以下の場合、その番号のメッセージを出力。
         * それ以外の場合は範囲内での指定を促す。
         * */
        if (0 <= num && num < message.length) {
            System.out.println(message[num]);
        } else {
            System.out.println("番号は0～" + (message.length - 1) + "の範囲で指定してください。");
        }

    }

}

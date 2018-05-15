package javatraining;

public class SelectGreeting {

    public static void main(String[] args) {
        //メッセージ内容
        String[] message = {
                "おはよう！", "こんにちは！", "こんばんは!"
        };
        //何も送られていない、もしくは2文字以上のとき
        if (args.length != 1) {
            //出力
            System.out.println("使い方:java SelectGreeting 番号");
            //終了
            System.exit(0);
        }
        //1文字目を数値に変換
        int num = Integer.parseInt(args[0]);
        //数値によって表示内容を変える
        if (0 <= num && num < message.length) {
            System.out.println(message[num]);
            //0～2以外をはじく
        } else {
            System.out.println("番号は0～" + (message.length - 1) + "の範囲で指定してください。");
        }
    }

}

package javatrainig;

public class SelectGreeting {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        //表示文字の配列
        String[] message = {"おはよう！", "こんにちは！", "こんばんは！"};

        if (args.length != 1) {
            System.out.println("使い方  : javaSelectGreeting 番号");
            System.exit(0);
        }

        int num = Integer.parseInt(args[0]);
        if (0 <= num && num < message.length) {
            System.out.println(message[num]);
        } else {
            System.out.println("番号は0～" + (message.length - 1) + "の範囲で指定してください。");
        }

    }

}

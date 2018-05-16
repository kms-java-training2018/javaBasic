package javatraining;

public class SelectGreeting {

    public static void main(String[] args) {
        String[] message;
        message = new String[3];
        //メッセージ内容
        message[0] = "おはよう！";
        message[1] = "こんにちは！";
        message[2] = "こんばんは！";

        if (args.length != 1) {
            System.out.println("使い方:java selectGreeeting 番号");
            System.exit(0);
        }
        int num = Integer.parseInt(args[0]);
        if (0 <= num && num < message.length) {
            System.out.println(message[num]);
        } else {
            System.out.println("番号は0～" + (message.length - 1) + "の範囲で指定してください");
        }


    }

}

package javatraining.Part6;

public class For6_2 {
    /*メインメソッド*/
    public static void main(String[] args) {
        /*10までの数字を表示するプログラム*/
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ":"); // 数字と：を表示
            /*数字の2乗分の＊を表示するプログラム*/
            for (int j = 0; j < i * i; j++) {
                System.out.print("*"); // ＊を表示
            }
            System.out.println(""); // 改行
        }
    }
}

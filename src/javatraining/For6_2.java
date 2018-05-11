package javatraining;

public class For6_2 {

    //アスタリスクを表示するプログラム
    public static void main(String[] args) {
        //縦列用ループ文
        //１０回ループする
        for (int i = 0; i < 10; i++) {
            //何列目か表記
            System.out.print(i + ":");
            //アスタリスク表記用ループ文
            //iの二乗個表記する。
            for (int j = 0; j < i * i; j++) {
                System.out.print("*");
            }
            //改行を行う
            System.out.println("");
        }
    }

}
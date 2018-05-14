package javatraining;

/**
 *
 * 2018/05/14
 * 三野進紀
 * 8章 メソッド
 * 二乗するプログラム
 *
 * */

public class MethodSquaring {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        //引数とする数字を格納する変数を宣言
        int p = 5;

        //引数を2乗し結果を返すメソッドを呼び出す
        int q = squaring(p);

        //結果出力
        System.out.println(p + "の2乗は" + q + "です。");

    }

    /** 引数を2乗して結果を返すメソッド*/
    public static int squaring(int n) {

        //計算をして結果を返す
        int result = n * n;
        return result;

    }

}

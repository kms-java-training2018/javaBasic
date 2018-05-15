package javatraining;

/**
*
* 2018/05/15
* 三野進紀
* 9章 配列
* 問題9_9 穴埋め問題
* 二次元配列arrの内容を表示するプログラム
*
* */

public class PrintArray {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        //二次元配列arrに値を代入
        int[][] arr = {
                { 3, 1, 4, 1, },
                { 5, 9, 2, },
                { 6, 5, },
                { 3, },
        };
        //メソッドprintArrayの呼び出し
        printArray(arr);

    }

    /**メソッドprintArrayの作成*/
    public static void printArray(int[][] n) {
        System.out.println("{");

        /**配列arrの中括弧の組の数だけ繰り返し*/
        for (int i = 0; i < n.length; i++) {
            /**インデントと中括弧の出力*/
            System.out.print("\t{ ");

            /**配列arrの中括弧の中に入っている値の数だけ繰り返し*/
            for (int j = 0; j < n[i].length; j++) {
                /**値を出力*/
                System.out.print(n[i][j] + ", ");
            }
            /**中括弧を出力*/
            System.out.println("},");
        }
        System.out.println("}");
    }

}

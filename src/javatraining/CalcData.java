package javatraining;

/**
*
* 2018/05/15
* 三野進紀
* 9章 配列
* 問題9_5 間違っているところを直す
* 数の合計を計算するプログラム
*
* */

public class CalcData {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        //double型で配列を宣言
        double[] data;

        /**インデックスの値が5になっていたので、6に変更*/
        data = new double[6];

        //数値を代入
        data[0] = 3.1;
        data[1] = 4.1;
        data[2] = 5.9;
        data[3] = 2.6;
        data[4] = 5.3;
        data[5] = 9.7;

        //合計用の変数を初期化
        double sum = 0.0;

        //データの数だけ繰り返す
        /** 「<=」になっていたので「<」に変更*/
        for (int i = 0; i < data.length; i++) {

            //data[i]の値とsumの値を足して、sumに代入
            sum += data[i];
        }
        //sumを出力
        System.out.println("sum = " + sum);

    }

}

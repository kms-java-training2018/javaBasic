package javatraining.Part9;

public class CalcData {

    /*
     * 	問題9-5
     * 	配列に入った小数の和を求めるプログラム
     */

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        double[] data;
        // 配列の用意
        data = new double[6];
        // 配列の初期化
        /*
         *	配列への代入
         */
        data[0] = 3.1;
        data[1] = 4.1;
        data[2] = 5.9;
        data[3] = 2.6;
        data[4] = 5.3;
        data[5] = 9.7;
        double sum = 0.0;
        // 合計値用の変数の用意と初期化
        for (int i = 0; i < data.length; i++) {
            // 配列の値の和を求める処理
            sum += data[i];
        }
        System.out.println("sum = " + sum);
        // 和の出力
    }

}

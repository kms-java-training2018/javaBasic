package javatraining;

/**
 * テキスト課題9-５
 * なぜエラーが起きるのか
 */

public class CalcData {
    public static void main(String[] args) {

        //配列定義
        double[] data;
        data = new double[5];

        //変数を5つ格納
        data[0] = 3.1;
        data[1] = 4.1;
        data[2] = 5.9;
        data[3] = 2.6;
        data[4] = 5.3;

        /*
         * エラー原因① "data[5] = 9.7;"
         * data = new double[5];の部分から、
         * 変数はdata[0]～[4]の5つである。
         * data[5]を含めるなら、new double[6]にする必要がある。
         */

        //合計値を算出
        double sum = 0.0;

        //data[0]～[4]の数値の合計を出す
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }

        /*
         * エラー原因② "i <= data.length;"
         * 今回、data.lengthは5である。
         * "="を入れてしまうと、i = 5の時に5 = 5で条件を満たしてしまい
         * for文を抜けない。
         * 上記のエラー原因①より、data[5]は存在しないため、"="は入れない。
         */

        //合計値を出力
        System.out.println("sum =" + sum);
    }
}

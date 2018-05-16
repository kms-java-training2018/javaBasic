package javatraining;


/**
 *
 * 【p238　問題9-5】
 * エラーを直す問題。
 * 変更箇所はコメントにて【】で表示しています。
 *
 * @author iyo-marina
 *
 */

public class CalcData {

    public static void main(String[] args) {

        // double型配列dataを宣言し、サイズを5個に決定
        // →サイズを【6】に変更する
        double[] data;
        data = new double[6];

        // 値を代入
        data[0] = 3.1;
        data[1] = 4.1;
        data[2] = 5.9;
        data[3] = 2.6;
        data[4] = 5.3;
        data[5] = 9.7;

        // 値を変数sumに足しこむ
        double sum = 0.0;
        for (int i = 0; i < data.length; i++) {	// for文の条件式内不等号を<=から【<】に変更する
            sum += data[i];
        }

        // 値の合計値を表示する
        System.out.println("sum = " + sum);

    }

}

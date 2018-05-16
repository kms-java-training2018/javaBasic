package javaBasic;


/**
 * 問題9-5
 * テキストp.238
 * エラーの原因は2つ
 * 1.配列のためのメモリを確保するとき、要素数が6ではなく5になってしまっており、数が合わない。
 * 2.合計を出していくループ処理のfor文の条件式が違う。
 * i <= data.lengthではなく、i < data.lengthが正しい。
 */
public class CalcData {
    public static void main(String[] args) {

        //配列(小数点を含める型の)を宣言
        double[] data;

        //配列のためのメモリを確保
        data = new double[6];

        //配列の要素に代入
        data[0] = 3.1;
        data[1] = 4.1;
        data[2] = 5.9;
        data[3] = 2.6;
        data[4] = 5.3;
        data[5] = 9.7;

        //配列の要素の合計値を格納する変数sumを宣言、初期化
        double sum = 0.0;

        //合計を出していくループ処理
        for(int i = 0; i < data.length; i++) {
            sum += data[i];
        }

        //結果の出力(合計値の表示)
        System.out.println("sum =" + sum);
    }
}

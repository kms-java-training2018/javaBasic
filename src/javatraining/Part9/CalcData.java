package javatraining.Part9;

/**
 * 数の合計を計算
 */

public class CalcData {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        double [] data;
        data = new double [6];    //配列数は[0]～[5]までの6つ
        data[0] = 3.1;
        data[1] = 4.1;
        data[2] = 5.9;
        data[3] = 2.6;
        data[4] = 5.3;
        data[5] = 9.7;

        double sum = 0.0;
        for (int i = 0; i <= data.length; i++) {
            sum = data[0] + data[1] + data[2] + data[3] + data[4] + data[5];
            /**sum += data[i]を
             * sum = data[0] + data[1] + data[2] + data[3] + data[4] + data[5]
             * に変更
             */
        }
        System.out.println("sum=" + sum);
    }

}

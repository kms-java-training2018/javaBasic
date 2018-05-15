package javatraining;

public class CalcData {
    public static void main(String[] args) {
        // 変数設定
        // 数列
        double[] data;
        data = new double[6];
        data[0] = 3.1;
        data[1] = 4.1;
        data[2] = 5.9;
        data[3] = 2.6;
        data[4] = 5.3;
        data[5] = 9.7;
        // 合計値
        double sum = 0.0;

        for (double d : data) {
            sum += d;
        }
        System.out.println("sum = " + sum);

    }
}

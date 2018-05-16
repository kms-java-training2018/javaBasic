package javatraining;

public class CalcDate {
    // 問題9-5
    public static void main(String[] args) {
        // double型の配列dateの宣言
        double[] date = {3.1, 4.1, 5.9, 2.6, 5.3, 9.7,};

        // 合計値を格納する変数sumの宣言
        double sum = 0.0;

        // 変数sumに配列dateの値を順番に足し合わせていくfor文
        for ( double calc : date) {
            sum += calc;
        }

        // 合計値をコンソールに出力
        System.out.println("sum = " + sum);
    }

}

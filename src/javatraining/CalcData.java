package javatraining;

public class CalcData {

    //問題9-5  どうしてエラーになるのか

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        double[] data;

        //↓new double[]内が5になっていたため、計算ができていなかった。
        data = new double[6];
        data[0] = 3.1;
        data[1] = 4.1;
        data[2] = 5.9;
        data[3] = 2.6;
        data[4] = 5.3;
        data[5] = 9.7;
        double sum = 0.0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        System.out.println("sum=" + sum);
    }

}

package javatraining;

public class CalcData {

    public static void main(String[] args) {
        double[] data;

        // 右辺の new.double[5]を[6]に変更
        data = new double[6];
        data[0] = 3.1;
        data[1] = 4.1;
        data[2] = 5.9;
        data[3] = 2.6;
        data[4] = 5.3;
        data[5] = 9.7;
        double sum = 0.0;

        // 条件式のi <= data.length を、 < に変更
        for(int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        System.out.println("sum = " + sum);
    }

}

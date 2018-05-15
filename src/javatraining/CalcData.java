package javatraining;

public class CalcData {

    public static void main(String[] args) {
        // 238p 9-5
        double[] data;
        data = new double[6]; // [5]を[6]に変更
        data[0] = 3.1;
        data[1] = 4.1;
        data[2] = 5.9;
        data[3] = 2.6;
        data[4] = 5.3;
        data[5] = 9.7;
        double sum = 0.0;
        for (int i = 0; i < data.length; i++) { // 条件の「<=」を「<」に変更
            sum += data[i];
        }
        System.out.println("sum = " + sum);

    }

}

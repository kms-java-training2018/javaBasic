package javatraining;

public class CalcData {

    public static void main(String[] args) {
        double[] data;
        //配列の長さを指定
        //訂正前  data = new double[5];
        data = new double[6];
        //
        data[0] = 3.1;
        data[1] = 4.1;
        data[2] = 5.9;
        data[3] = 2.6;
        data[4] = 5.3;
        data[5] = 9.7;
        double sum = 0.0;
        //要素の回数分繰り返すfor文
        //訂正前  for (int i = 0; i <= data.length; i++) {
        for (int i = 0; i < data.length; i++) {
            //合計値を出す
            sum += data[i];
        }
        //結果を出力
        System.out.println("sum =" + sum);
    }

}

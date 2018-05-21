package javatraining;

public class List8_1 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        //引数とする数字を格納する変数を設定
        int n = 3;

        //引数を二乗し結果を返すメソッドを呼び出す
        n = squaring(n);

        //結果を出力
        System.out.println(n);
    }

    public static int squaring(int number) {
        int number2 = number * number;
        return number2;
    }

}

package javatrainig;

public class Method {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        //引数とする数字を格納する変数を宣言
        int p, q;
        p = 2;
        //引数を2乗し結果を返すメソッドを呼び出す
        q = squaring(p);
        //結果を出力
        System.out.println(q);
    }

    public static int squaring(int number) {
        int number2 = number * number;
        return number2;
    }

}

package javatraining;

public class MethodSquaring {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        //引数とする数字を格納する変数を宣言
        int p;
        p = 25;

        //引数を2乗し結果を返すメソッドを呼び出す
        int q = squaring(p);

        //結果出力
        System.out.println(p + "を2乗したら" + q);
    }

    //計算して結果を返す
    public static int squaring(int n) {
        return n * n;
    }

}

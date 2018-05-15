package javatraining;

public class MethodSquaring {

    public static void main(String[] args) {
        // 引数とする数字を格納する変数を宣言
        int p;
        int q;
        // 引数を２乗し結果を返すメソッドを呼び出す
        p = 2; // 元の数値の決定
        q = squaring(p);

        // 結果を出力
        System.out.println(p + "の2乗は、" + q + "です。");
    }

    /** 引数を2乗し、結果を返すメソッド **/
    public static int squaring(int n) {
        // 計算して結果を返す
        return n * n;

        // 以下修正前のfor文を使ったメソッドになります
        // for文を使い、2乗意外の累乗にも対応
        //int y = 1;
        //int z = 15; // 累乗値の決定
        //for (int x = 0; x < z; x++) {
        //    y = n * y;
        //}
        //return y;
        // ここまで
    }

}
package javatraining;

public class MetodSquaring {
    public static void main(String[] args) {

        //引数とする数字を格納する変数を宣言
        int p;
        int q;

        //変数を２乗し結果を返すメソッドを呼び出す
        p = 2;
        q = squaring(p);

        //結果を出力
        System.out.println(p + "を2乗すると" + q);
    }

    public static int squaring(int n) {

        int j = 1;
        for (int i = 0; i < 2; i++) {
            j = j * n;
        }

        //計算をして計算を返す
        return j;
    }
}
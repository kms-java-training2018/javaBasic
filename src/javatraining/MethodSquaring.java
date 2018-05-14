package javatraining;

public class MethodSquaring {

    public static void main(String[] args) {
        // 引数とする数字を格納する変数を宣言
        int i,j;
        i = 10;
        //引数を二乗して結果を返すメソッドを呼び出す
        j = squaring(i);
        //結果を出力
        System.out.println(i+"の二乗は"+ j + "です");
    }
    /**引数を二乗するメソッド*/
    public static int squaring(int i) {
        //計算をして結果を返す
        return i * i;
    }
}

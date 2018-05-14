package javatraining;

/**
 *
 * 5/14講義内課題
 * ２乗するメソッドを作る。
 *
 * @author iyo-marina
 *
 */

public class MethodSquaring {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        // 引数とする変数を宣言
        int i = 4;
        // 引数を２乗し結果を返すメソッド呼び出し、その戻り値を変数jに初期化
        String j = squaring(i);
        // 結果出力
        System.out.println(i +"の2乗は"+ j +"です。");

    }
    // 引数を２乗し結果を返すメソッド
    public static String squaring (int n) {
        // 計算をして結果を返す
        return String.valueOf(n * n);
    }

}

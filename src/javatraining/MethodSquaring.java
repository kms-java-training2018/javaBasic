package javatraining;

public class MethodSquaring {

    public static void main(String[] args) {
        // 引数とする数字を格納する変数を宣言
        int num = 4;
        // 何乗するかの変数
        int perfectPower = 2;
        // 両方の数値が0以外のときは累乗する
        if (num != 0 || perfectPower != 0) {
            // 一つ目の引数を二つ目の数累乗します。
            int squaringNum = squaring(num, perfectPower);
            // 結果を出力
            System.out.println(num + "を" + perfectPower + "乗した値は" + squaringNum + "です。");
        } else {
            //数値が0の場合の累乗は行わない
            System.out.println(num + "を" + perfectPower + "乗した値は解りません");
        }
    }

    public static int squaring(int num, int perfectPower) {
        // 計算結果
        int squaringNum = 1;

        // 累乗する
        for (int i = 0; i < perfectPower; i++) {
            squaringNum *= num;
        }
        // 計算して結果を返す
        return squaringNum;
    }

}

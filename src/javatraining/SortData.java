package javatraining;

/**
 * 教科書　上　p.240
 * 問題9-8
 * 「ソートプログラムを完成させましょう。」
 * */
public class SortData {

    public static void main(String[] args) {
        /*
         * 元の配列を設定。
         * */
        int[] data = { 31, 41, 59, 26, 53, 58, 97, 93, 23, 84 };
        /*
         * 現在の配列の並びを表示。
         * */
        System.out.println("並び替える前");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        /*
         * 一つ目のfor文で1周ごとの最小値を確定させていく。
         * 二つ目のfor文でその周の番号の数値（1周目の場合はdata[0]の数値）と比較していき、
         * その周の番号の数値よりも小さいとき、数値を入れ替える。
         * 1周の処理が終わるごとに最小値が確定していく。
         * */
        for (int i = 0; i < data.length; i++) { //???→data.length
            for (int j = i + 1; j < data.length; j++) { //???→data.length
                if (data[i] > data[j]) {
                    //交換(???)
                    int a = data[i];
                    data[i] = data[j];
                    data[j] = a;
                }
            }
        }
        /*
         * 並び替え後の表示
         * */
        System.out.println("並び替えた後");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }

}

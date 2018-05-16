package javatraining;

/**
*
* 2018/05/15
* 三野進紀
* 9章 配列
* 問題9_7 穴埋め問題
* 配列dataの要素の中で最大値を表示するプログラム
*
* */

public class ShowMaxData {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        //配列に値を代入
        int[] data = { 31, 41, 59, 26, 53, 58, 97, 93, 23, 84 };

        //最大値用の変数にdata[0]の値(31)を代入
        int max_data = data[0];

        /**配列dataの値の数だけ繰り返す*/
        for (int i = 0; i < data.length; i++) {
            /**次の値と比較して大きければその値をmax_dataに代入する*/
            if (max_data < data[i]) {
                max_data = data[i];

            }
        }
        //max_dataを出力
        System.out.println("最大値は" + max_data + "です。");

    }

}

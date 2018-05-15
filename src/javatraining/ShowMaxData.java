package javatraining;

/**
 * テキスト課題9-7
 * 配列dataの要素の中でもっとも大きい数字を表示する
 */

public class ShowMaxData {

    public static void main(String[] args) {

        //10個の数字を配列に格納
        int[] data = { 31, 41, 59, 26, 53, 58, 97, 93, 23, 84 };

        //配列の一番目を最大値と仮定し初期化
        int max_data = data[0];

        //配列の一番目から順に比較
        for (int i = 0; i < data.length; i++) {

            //比較した要素の方が大きければ
            if (max_data < data[i]) {

                //代入
                max_data = data[i];
            }
        }

        //最大値を出力
        System.out.println("最大値は" + max_data + "です。");
    }

}

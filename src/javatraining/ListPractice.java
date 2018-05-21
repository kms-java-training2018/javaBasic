package javatraining;

import java.util.ArrayList;

/**
 *	list問題
 *	0～99までの間の数値をランダムで10個
 *	重複しないように出力するプログラム
 *	その中で最大の値も出力する。
 * @author teranoshita-yuta
 */
public class ListPractice {
    // メインメソッド
    public static void main(String[] args) {
        // ArrayListのインスタンス確保
        ArrayList<Integer> list = new ArrayList<Integer>();
        // 変数宣言
        final int BASE_DATA = 100; //
        int maxNum = 0; // 最大値の要素数を格納する変数
        int maxData = 0; // 最大値を格納する変数

        // ランダムな数を10個配列に入れる
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * BASE_DATA));
            // 数値チェック
            for (int j = 0; j < list.size(); j++) {
                if (i > j && list.get(j) == list.get(i)) {
                    list.remove(i);
                    i--;
                }
            }
        }
        // 数値出力
        for (int i : list) {
            System.out.print((list.indexOf(i) + 1) + ":");
            System.out.println(i);
            if (list.get(list.indexOf(i)) > maxData) {
                maxData = list.get(list.indexOf(i));
                maxNum = list.indexOf(i) + 1;
            }
        }
        System.out.println("最大値の要素数" + maxNum);
        System.out.println("最大値:" + maxData);
    }

}

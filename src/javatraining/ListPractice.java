package javatraining;

import java.util.ArrayList;

public class ListPractice {
    public static void main(String[] args) {
        // 適当な数字をリストにつめて
        // 最大値の要素番号を取得し表示する
        // リストにつめる値は0～99のランダム
        // for文10回使う

        // ランダムな数値を入れる変数を定義
        int ran = 0;

        // リストを生成
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            ran = (int) (Math.random() * 100);

            list.add(ran);
            System.out.print(list.get(i) + ", ");
        }
        System.out.println("");
        // 最大値、最大値の要素番号を宣言し、リストから取り出す
        int max_data = 0;
        int max_data_number = 0;
        for (int j = 0; j < list.size(); j++) {
            if (max_data < list.get(j)) {
                max_data = list.get(j);
                max_data_number = j;
            }

        }

        System.out.println("最大値は" + max_data + "です");
        System.out.println("最大値の要素番号は" + max_data_number + "です");

        // 数値が一意である時の処理
        for (int k = 0; k < list.size(); k++) {
            for (int l = k + 1; l < list.size(); l++) {
                if (list.get(k) == list.get(l)) {
                    list.remove(l);
                    l--;
                }
            }

        }
        for (int m = 0; m < list.size(); m++) {
            System.out.print(list.get(m) + ", ");
        }

    }
}
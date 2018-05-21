package javatraining;

import java.util.ArrayList;

public class ListPractice {

    public static void main(String[] args) {
        // 変数定義
        int number; // ランダムに選ばれた数字を入れるための変数
        int count = 0; // 要素番号を入れるための変数
        int max = 0; // 最大番号をいるための値
        ArrayList<Integer> list = new ArrayList<Integer>();
        // 10回繰り返します
        for (int i = 0; i < 10; i++) {
            number = (int) (Math.random() * 100); // ランダムに数字を選ぶ
            // 同じ値がなければ、listに追加する
            if (!list.contains(number)) { // containsメソッドで、配列に同じ値があるかを調べる trueの場合、同じ値がある
                list.add(number);
            }
            // 最大値の検索
            for (int j = 0; j < list.size(); j++ ) {
                // maxに最大値を入れる。
                if (max < list.get(j)) {
                    max = list.get(j);
                    // 要素番号をcountに入れる
                    count = j;
                }
            }
        }
        System.out.println("最大値の要素番号:" + count);
        System.out.println("最大値:" + max);

        // debug用
        int debugNum = 0;
        for (int i : list) {
            System.out.println(list.get(debugNum));
            debugNum++;
        }
    }

}

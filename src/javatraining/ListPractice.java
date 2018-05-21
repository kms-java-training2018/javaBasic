package javatraining;

import java.util.ArrayList;

public class ListPractice {
    /**
     * リストの中で最大値を取得し表記する
     * @param args
     */
    public static void main(String[] args) {
        // リスト
        ArrayList<Integer> list = new ArrayList<Integer>();
        // 最大値
        int max = 0;
        // 最大値の要素番号
        int maxNum = 1;
        // 比べる数
        int randum;
        // リスト内に代入する
        for (int i = 0; i < 10; i++) {
            // ランダムな数値を取得
            randum = (int) (Math.random() * 100);
            // 番号と数値を表記
            System.out.println("要素番号 " + (i + 1) + ": 要素数 " + randum);
            // 同じ要素がなければListに追加
            if (!(list.contains(randum))) {
                // 追加
                list.add(randum);
                // 最大値より大きければ最大値として確保
                if (randum > max) {
                    maxNum = i + 1;
                    max = randum;
                }
            }

        }
        System.out.println("リストの要素数 : " + list.size());
        System.out.println("最大値の要素番号 : " + maxNum);
        System.out.println("最大値の要素数 : " + max);
        // これで最大値をとることも出来るらしい
        // System.out.println(list.stream().max(Comparator.naturalOrder()).get());
    }

}
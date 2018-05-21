package javatraining;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ListPractice {
    public static void main(String[] args) {

        //ArrayListのインスタンスの確保
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        //Randomクラスの生成
        Random r = new Random();

        //10個のランダムな数値を取得し追加
        for (int i = 0; i < 10; i++)
            list1.add(r.nextInt(100));

        //重複削除
        Set<Integer> set = new HashSet<>(list1);

        //新しいlistを作成
        ArrayList<Integer> list2 = new ArrayList<>(set);

        //最大値max
        //最大値の要素番号maxNum
        int max = 0;
        int maxNum = 0;

        //最大値の取得
        for (int i = 0; i < list2.size(); i++) {
            if (max < list2.get(i)) {
                max = list2.get(i);
                maxNum = (i + 1);
            }
            //要素の参照
            System.out.println((i + 1) + ":" + list2.get(i));
        }

        //最大値と要素番号の出力
        System.out.println("最大値の要素番号：" + maxNum);
        System.out.println("最大値：" + max);

    }
}

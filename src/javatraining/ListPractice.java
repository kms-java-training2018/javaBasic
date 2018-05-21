package javatraining;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class ListPractice {

    public static void main(String[] args) {
        //maxは最大値の要素番号、max_numは最大値
        int max = 0;
        int max_num = 0;

        //リストを作り、その中に0-99のランダムな数値を入れる
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 10; i++)
            list.add(r.nextInt(100));

        //被った数値を削除し、削除後のlist2を作成
        Set<Integer> set = new HashSet<>(list);
        List<Integer> list2 = new ArrayList<>(set);

        //最大値、最大値の要素番号を求める
        for (int i = 0; i < list2.size(); i++) {
            if (max_num < list2.get(i)) {
                max_num = list2.get(i);
                max = i + 1;
            }
            //全要素の表示
            System.out.println((i + 1) + ":" + list2.get(i));
        }
        //最大値の要素番号、最大値を表示
        System.out.println("最大値の要素番号" + max);
        System.out.println("最大値" + max_num);
    }
}
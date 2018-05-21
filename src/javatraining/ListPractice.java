package javatraining;

import java.util.ArrayList;

public class ListPractice {

    public static void main(String[] args) {
        //アレイインスタンス
        ArrayList<Integer> list = new ArrayList<Integer>();
        int max = 0;
        int num = 0;
        //ランダム数を10個作る
        for (int i = 0; i < 10; i++) {
            num = ((int) (Math.random() * 10));
            //かぶり
            if (list.contains(num)) {

            } else {
                list.add(num);
                System.out.println(num);
            }
            System.out.println(i + 1 + " : " + list.get(list.size()));

        }
        //要素の比較
        max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }

        }
        //最大値の参照
        System.out.println("最大値は" + (list.indexOf(max) + 1) + " : " + max);

    }

}

package javatraining;

import java.util.ArrayList;
import java.util.Random;

public class ListPractice {

    public static void main(String[] args) {
        // ArrayListのインスタンス(サイズ)の確保
        ArrayList<Integer> list = new ArrayList<Integer>();

        // 要素の追加

        // for文を10回まわして、すべての値が一意になるように、リストに追加
        for (int i = 0; i < 10; i++) {
            // 0~99の範囲で値を1つ生成(リストに入る値の候補)
            Random rnd = new Random();
            int newNum = rnd.nextInt(100);
//            System.out.println(newNum);
            // リスト内要素の値に、重複があるか判定し、なしの場合追加
            if (!list.contains(newNum)) {
                list.add(newNum);
            }
        }



        // 最大値とその要素番号を表示
        int maxNum = list.get(0);
//        for (int i = 0; i < list.size(); i++) {
//            if (maxNum < list.get(i)) {
//                maxNum = list.get(i);
//            }
//        }
//        ↓拡張for文書き直し
        for (Integer integer : list) {
            if (maxNum < integer) {
                maxNum = integer;
            }
        }

        System.out.println("最大値の要素番号：" + list.indexOf(maxNum));
        System.out.println("最大値：" + maxNum);

        // すべての要素番号とすべての値を表示
        System.out.println("【以下デバッグ用】");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("要素番号：" + i);
            System.out.println("値：" + list.get(i));
        }

    }

}

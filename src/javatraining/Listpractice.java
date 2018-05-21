//list問題

package javatraining;

import java.util.ArrayList;

public class Listpractice {

    public static void main(String[] args) {

        //リストの確保
        ArrayList<Integer> list = new ArrayList<Integer>();

        //要素の代入
        for (int i = 0; i <= 10; i++) {
            list.add((int) (Math.random() * 100));
        }

        //重複削除
        for (int a = 0; a < list.size(); a++) {
            for (int b = a + 1; b < list.size(); b++) {
                if (list.get(a) == list.get(b)) {
                    list.remove(b);
                }
            }
        }
        //全ての要素番号と値を出力
        System.out.println("全ての要素番号と値を出力します。");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("要素番号[" + i + "]:" + list.get(i));
        }

        //最大値取得
        int x = list.get(0);
        int y = 0;

        for (int j = 0; j < list.size(); j++) {
            if (x < list.get(j)) {
                x = list.get(j);
                y = j;
            }
        }
        System.out.println("");
        System.out.println("最大値の値は" + x);
        System.out.println("最大値の要素番号は" + y);
    }

}

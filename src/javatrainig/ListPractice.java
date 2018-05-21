package javatrainig;

import java.util.ArrayList;

public class ListPractice {
    public static void main(String[] args) {

        //リスト
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int n = 0; n < 10; n++) {
            list.add((int) (Math.random() * 99 + 1));

            //重複削除
            for (int a = 0; a < list.size(); a++) {
                for (int b = a + 1; b < list.size(); b++) {
                    if (list.get(a) == list.get(b)) {
                        list.remove(b);
                    }
                }

            }
        }
        //番号
        for (int c = 0; c < list.size(); c++) {
            System.out.println("要素番号" + c + ",数値は" + list.get(c) + "です。");
        }

        //最大値
        int max_data = 0;
        int max_number = 0;

        //最大値の比較
        for (int i = 0; i < list.size(); i++) {

            //最大値が今見ている数値のほうが大きい場合
            if (max_data < list.get(i)) {
                //最大値を代入
                max_data = list.get(i);
                // 最大の配列番号
                max_number = i + 1;
            }
        }

        //        for (Integer rr : list) {
        //            //最大値が今見ている数値のほうが大きい場合
        //            if (max_data < rr) {
        //                //最大値を代入
        //                max_data = rr;
        //            }
        //        }

        //最大値の表示
        System.out.println("最大値は" + max_data + "です。");
        //最大値の番号の表示
        System.out.println("番号は" + max_number + "です。");
    }

}

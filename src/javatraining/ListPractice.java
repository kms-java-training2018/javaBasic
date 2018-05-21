package javatraining;

import java.util.ArrayList;

public class ListPractice {

    public static void main(String[] args) {
        // 5/21課題1
        /**
         * 0～99のランダムな数値を10個つめたリストを
         * 表示した後、最大値のインデックスと値を書き出す
         * ただし数値は一意になるようにし、
         * 重複に応じてリストは短くなるものとする。
         */
        /**
         * 宣言
         */
        int max = 0;
        int maxIndex = 0;
        int num;
        ArrayList<Integer> list = new ArrayList<Integer>();
        /**
         *  リスト入力
         */
        for (int i = 0; i < 10; i++) {
            num = (int) (Math.random() * 100);
            list.add(num);
            /*
             *  contains使ってみた場合
             *  listに値が含まれているか確認し
             *  含まれていればtrue
             */
            //			if(list.contains(num)) {
            //				// 含まれているので追加しない
            //			}else {
            //				// 含まれていないので追加
            //				list.add(num);
            //			}
        }
        // 重複削除(contains使わない場合)
        for (int j = 0; j < list.size(); j++) {
            for (int k = j + 1; k < list.size(); k++) {
                if (list.get(j) == list.get(k)) {
                    list.remove(k);
                    /*
                     *  k削除したためlistがつめられた
                     *  もう一度kを見るので減算
                     */
                    k--;

                }
            }
        }
        /**
         *  要素一覧表示
         */
        for (int l : list) {
            System.out.print(l + ", ");
        }
        System.out.println("");

        /**
         *  最大値取得
         */
        max = list.get(0);
        for (int m = 1; m < list.size(); m++) {
            // 比較して大きければ更新
            if (max < list.get(m)) {
                max = list.get(m);
                maxIndex = m;
            }
        }
        /**
         *  結果表示
         */
        System.out.println("最大値の要素番号 : " + maxIndex);
        System.out.println("最大値 : " + max);

    }

}

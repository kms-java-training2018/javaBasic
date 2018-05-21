package javatraining;

import java.util.ArrayList;


//適当な数字をリストにつめて最大値と最大値の要素番号を取得し表示してください。
//リストにつめる値は、0~99のランダムな値とし、このとき値は一意とする。
//for文10回
//※デバックとして以下も出力。すべての要素番号とすべての値を表示してください。

public class ListPractice {

    public static void main(String[] args) {
        //ArrayListのインスタンスの確保
        ArrayList<Integer> list = new ArrayList<Integer>();
        int max = 0;

        //要素の参照
        for (int i = 0; i < 10; i++) {
            int randomNum1 = (int) (Math.random() * 100);
            //重複した値がなければ代入
            if (!list.contains(randomNum1)) {
                //配列の代入
                list.add(randomNum1);
            }

            // 最大値を求める
            for (int j = 0; j < list.size(); j++)
                max = Math.max(max, list.get(j));


        }
        System.out.println("最大値は" + max);

        //最大値の要素番号を求める
        int index = list.indexOf(max);
        System.out.println("最大値の要素番号は" + index);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}

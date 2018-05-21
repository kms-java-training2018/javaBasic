package javatraining;

/**
*
* @author mitsuno-shinki
* 2018/05/21
* ArrayList
* 0～99の適当な値をlistにつめて、要素番号と値を出力
* その中の最大値とその要素番号を出力するプログラム
*
*/

import java.util.ArrayList;

public class ListPractice {

    public static void main(String[] args) {

        //変数とインスタンス宣言、初期化
        ArrayList<Integer> list = new ArrayList<Integer>();
        Integer j = 0;
        Integer num;
        int max = 0;
        int maxNumber = 0;

        //10回繰り返し
        loop: for (int i = 0; i < 10; i++) {

            //nにiを代入
            j = i;
            //ランダムの数でnumを初期化
            num = (int) (Math.random() * 100);

            //要素の数だけ繰り返し
            for (; j > 0; j--) {

                //既にlistの中に同じ数があればloopまでブレイク
                if (j >= 1 && num.equals(list.get(j - 1))) {
                    break loop;
                }

            }

            //listに数値を追加、出力
            list.add(num);
            System.out.println("要素番号：" + i);
            System.out.println("要素の数：" + list.get(i));

            //追加した数値がmaxよりも大きければ、その数値をmaxに代入
            if (list.get(i) > max) {
                max = list.get(i);
                maxNumber = i;

            }

        }
        //最大値と要素番号を出力
        System.out.println("\n最大値の要素番号：" + maxNumber);
        System.out.println("最大値：" + max);

    }

}

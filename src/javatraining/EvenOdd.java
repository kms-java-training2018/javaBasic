package javatraining;

/**
* 2018/05/21
* 三野進紀
* 4～7章課題集 課題⑦
* 偶数と奇数のリスト作成。昇順でそれぞれ表示する
* */

import java.util.ArrayList;
import java.util.Collections;

public class EvenOdd {

    public static void main(String[] args) {

        //偶数用のインスタンス宣言
        ArrayList<Integer> even = new ArrayList<Integer>();
        //奇数用のインスタンス宣言
        ArrayList<Integer> odd = new ArrayList<Integer>();

        //ランダム用の変数
        int num;

        //無限ループ
        while (true) {

            //0～10までのランダムな数字
            num = (int) (Math.random() * 11);

            //もし0が入力されたらループ抜け出し
            if (num == 0) {
                System.out.println("0が入力されました\n");
                break;
            }

            //偶数だった場合
            if (num % 2 == 0) {
                //同じ数があった場合ループの最初から
                if (even.contains(num)) {
                    continue;
                }
                //なければ追加
                even.add(num);

                //奇数だった場合
            } else if (num % 2 == 1) {
                //同じ数があった場合ループの最初から
                if (odd.contains(num)) {
                    continue;
                }
                //なければ追加
                odd.add(num);
            }

            //数を出力
            System.out.println("0～10の値を出力：" + num);
        }

        //偶数リスト昇順に
        Collections.sort(even);
        //偶数の出力
        System.out.print("偶数：");
        for (int e : even) {
            System.out.print(e + " ");
        }

        //奇数リスト昇順に
        Collections.sort(odd);
        //奇数の出力
        System.out.println();
        System.out.print("奇数：");

        for (int o : odd) {
            System.out.print(o + " ");
        }
    }
}
package javaTraining;

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
                // kojima add このif文は不要。 「！」で存在しない場合のみに実施する処理の方がスマートです。
            } else {
                list.add(num);
                // kojima add この位置にデバッグプリントを出すならlist.size()で出してもいいと思われる。
                System.out.println(list.size() + " : " + String.valueOf(num));
                //System.out.println(i + 1 + " : " + list.get(list.size()));
            }
        }
        //要素の比較
        max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }

        }
        // kojima add start ここで改めてデバッグプリント用のfor文を作って出力してた方が簡単かも
        System.out.println("デバッグプリントstart");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + " : " + list.get(i));
        }
        System.out.println("デバッグプリントend");
        // kojima add end

        //最大値の参照
        System.out.println("最大値は" + (list.indexOf(max) + 1) + " : " + max);

    }

}
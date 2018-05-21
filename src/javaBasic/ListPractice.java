package javaBasic;
/**
 * 5/21課題
 * リスト問題
 */
import java.util.ArrayList;

public class ListPractice {
    public static void main(String[] args) {
        //1.ArrayListのインスタンスの確保
        ArrayList<Integer> list = new ArrayList<Integer>();

        //2.以下の要素追加のループを10回繰り返す
        for(int count = 1; count<11; count++) {
            //0～99の乱数を出し、
            int number = (int)(Math.random()*100);
            //それがリストにないものならリストに追加する
            if(!list.contains (number)) {
                list.add(number);
                number = 0;
            }
        }

        //3.リスト内の最大値を求める。
         //最大値を格納するための変数を1つ作り、そこに「より大きいほう」を入れ続けていく。
         //for文が必要である。
        int max_number = list.get(0);
        for(int i = 1; i < list.size(); i++) {
            if(max_number < list.get(i)) {
                max_number = list.get(i);
            }
        }

        //4.結果表示
        //最大値とその要素番号を表示する
        System.out.println("最大値の要素番号: "+ list.indexOf(max_number));
        System.out.println("最大値: "+ max_number);
        System.out.println("");
        //デバッグ用に全要素番号と値を出力する
        for(int j = 0; j< list.size(); j++) {
            System.out.println(j + " : "+ list.get(j));
        }
    }
}

package javatraining.Part19;
/**
 * 適当な数字をリストにつめて、
 * 最大値の要素番号と最大値を取得し表示。
 * リストにつめる値は、0～99のランダムな値(値は一意)
 * for文を10回
 * デバックとして、全ての要素番号と値を表示。
 */
import java.util.ArrayList;
import java.util.Random;

public class ListPractice {


    public static void main(String[] args) {
        //ランダムな値が10個入ったlistA
        ArrayList<Integer> list = new ArrayList<Integer>();

        Random r = new Random();
        int i;

        //要素の個数が(index)=0～9の10個になるまで繰り返す
        for(i = 0; i < 10; i++) {
            //0～99のランダムな値のうちlistにないものだけを追加
            int g = r.nextInt(100);
            if(!list.contains(g)) {
                list.add (g);
            }
        }

        //要素の表示
        for(i = 0; i < list.size(); i++) {
            System.out.println(i + ":" + list.get(i));
        }

        //最大値を求めて表示
        int max = list.get(0);
        for(i = 0; i < list.size(); i++) {
            if(max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println("最大値の要素番号："+ list.indexOf(max));
        System.out.println("最大値："+ max);
    }

}

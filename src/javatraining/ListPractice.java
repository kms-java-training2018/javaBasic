package javatraining;

import java.util.ArrayList;

public class ListPractice {

    public static void main(String[] args) {
    	// listを作成
    	ArrayList<Integer> list = new ArrayList<Integer>();
        // ランダムな数字を格納する変数宣言
        int random = 0;
        // 最大値を格納変数宣言
        int max = 0;
        // 最大値のindex格納変数宣言
        int maxIndex = 0;
        
        // 1つ目の要素を格納
        random = (int) (Math.random() * 100);
        list.add(random);
        
        // 最大値を要素番号0、最大値0と設定する
        max = list.get(0);
        maxIndex = 0;
        
        // 1つ目の要素を出力
        System.out.println("0 : "  + list.get(0));

        // 9回繰り返す
        for (int i = 1; i < 10; i++) {

        	// 	現在のlistの要素数分繰り返す
            for (int j = 1; j < list.size()+1; j++) {
            	// ランダムな数字を取得
            	random = (int) (Math.random() * 100);
            	
            	// list内に重複がないかチェック
                while ( random == list.get(j-1)) {
                	// 重複があった場合新たにランダムな数字を取得
                	random = (int) (Math.random() * 100);
                }
            }
            
            // 重複しない数字を要素に加える
            list.add(random);

            // 要素番号と数字を出力
            System.out.println(i + " : "  + list.get(i));

            // 新たな要素が最大値かチェック
            if (max < list.get(i)) {
                max = list.get(i);
                maxIndex = i;
            }
        }
        // 最大値を出力
        System.out.println("最大値の要素番は : " + maxIndex);
        System.out.println("最大値 : " + max );
    }
}

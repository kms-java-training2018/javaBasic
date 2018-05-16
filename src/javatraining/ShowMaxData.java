package javatraining;

/**
*
* 【p240 問題9-7】
* 配列の中の最大値を求める。
*
* @author iyo-marina
*/

public class ShowMaxData {

    public static void main(String[] args) {
        // int型配列dataを宣言し、まとめて初期化
        int data[] = {31, 41, 59,26,53,58,97,93,23,84 };

        // 最大値を入れるint型変数max_dataを宣言し、配列data[0]の値で初期化
        int max_data = data[0];

        // 配列の0番目から、max_dataとの値を比較し、大きいほうをmax_datに代入しなおす
        for (int i = 0; i < data.length ; i++) {
            if (max_data < data[i]) {
                max_data = data[i];
            }
        }
        // 最大値を表示
        System.out.println("最大値は"+ max_data +"です。");


    }

}

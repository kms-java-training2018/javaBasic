package javatraining;

/**
 * 【pp240-1 問題9-8】
 * ソートプログラム
 * @author iyo-marina
 *
 */
public class SortData {

    public static void main(String[] args) {
        // int型配列dataを宣言し、まとめて初期化
        int data[] = {31, 41, 59,26,53,58,97,93,23,84 };

        // 並べ替える前の配列を表示
        System.out.println("並べ替える前");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");

        // 【配列を並べ替える】
        // 配列dataのi番目の値と、j(i+1)番目の値を比較し、i番目の値が大きい場合、値を入れ替える
        // （i番目の値を以降の値の最小にするように並べ替える。）
        for (int i = 0; i < (data.length - 1) ; i++) {		// 配列の要素の個数-1の処理を行った時点で、残った値は最大になるため、
                                                            // 要素の個数-1の回数まで続ける。
            for (int j = i +1; j < data.length ; j++) {
                if (data[i] > data[j]) {
                    // 交換
                    int a = data[i];						// 入れ替え用のint型変数a
                    data[i] = data[j];
                    data[j] = a;
                }
            }
        }

        // 並べ替えた後の配列を表示
        System.out.println("並べ替えた後");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] +" ");
        }
        System.out.println("");
    }

}

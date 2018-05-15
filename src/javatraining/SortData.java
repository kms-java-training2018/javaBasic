package javatraining;

/**
*
* 2018/05/15
* 三野進紀
* 9章 配列
* 問題9_8 穴埋め問題
* 配列dataの要素と昇順に並び替えるプログラム
*
* */

public class SortData {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        //配列dataに値を代入
        int[] data = { 31, 41, 59, 26, 53, 58, 97, 93, 23, 84 };

        //現段階の配列の値を並べる
        System.out.println("並び替える前");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");

        /**配列の最初の値と次の値を比較する
         * それが終わればその次の値を比較する。これを配列dataの数だけ繰り返す*/
        for (int i = 0; i < (data.length - 1); i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    /**data[i]のほうがdata[j]よりも大きければ交換*/
                    int sort = data[i];
                    data[i] = data[j];
                    data[j] = sort;
                }
            }
        }
        //並び替えた後の配列dataを出力
        System.out.println("並び替えた後");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }

}

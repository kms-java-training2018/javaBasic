package javatraining;

/**
 * テキスト課題9-8
 * 配列dataの要素を小さい順(昇順)に並び替える
 */

public class SortData {
    public static void main(String[] args) {

        //配列dataの要素10個
        int[] data = { 31, 41, 59, 26, 53, 58, 97, 93, 23, 84 };

        //コメント出力
        System.out.println("並び替える前");

        //配列の要素を順に出力
        for (int i = 0; i < data.length; i++) {

            //要素の後にはスペースを設ける
            System.out.print(data[i] + " ");
        }

        //要素をすべて出力後改行
        System.out.println("");

        //
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {

                    //逃がすための変数を用意
                    int x = 0;

                    //data[i]とdata[j]を交換
                    x = data[i];
                    data[i] = data[j];
                    data[j] = x;
                }
            }
        }

        //コメント出力
        System.out.println("並べ替えた後");

        //並べ替えた配列の要素を順に出力
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }

        //要素をすべて出力後改行
        System.out.println("");
    }
}

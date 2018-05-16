package javatraining.Part9;

public class SortData {

    /*
     * 	問題9-8
     * 	データを昇順にするプログラム
     */

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int[] data = { 31, 41, 59, 26, 53, 58, 97, 93, 23, 84 };
        // 整数型配列の初期化と代入
        System.out.println("並べ替える前");
        for (int i = 0; i < data.length; i++) {
            // 整列前の配列を出力
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        // 改行
        for (int i = 0; i < data.length - 1; i++) {
            // 配列の中身を昇順で整列
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    // データの交換
                    int backup = data[i];
                    data[i] = data[j];
                    data[j] = backup;
                }
            }
        }
        System.out.println("並べ替えた後");
        for (int i = 0; i < data.length; i++) {
            // 整列後のデータ出力
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        // 改行
    }
}

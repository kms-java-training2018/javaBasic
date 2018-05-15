package javatraining;

public class SortData {

    public static void main(String[] args) {
        // 変数設定
        // 配列
        int[] data = { 31, 41, 59, 26, 53, 58, 97, 93, 23, 84 };
        // 並べ替える前表示
        System.out.println("並べ替える前");
        for (int i : data) {
            System.out.print(i + " ");
        }
        // 改行
        System.out.println("");
        // ソート
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    // 交換
                    int taihi = data[i];
                    data[i] = data[j];
                    data[j] = taihi;
                }
            }
        }
        // 並べ替えた後表示
        System.out.println("並べ替えた後");
        for (int i : data) {
            System.out.print(i + " ");
        }
        // 改行
        System.out.println("");
    }

}

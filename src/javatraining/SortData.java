package javatraining;

public class SortData {

    public static void main(String[] args) {
        // 241p List9-13
        int[] data = { 31, 41, 59, 26, 53, 58, 97, 93, 23, 84 };
        System.out.println("並べ替える前");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < data.length; i++) {	// データの長さまで繰り返す
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    //交換	一時保管用の変数を定義して入れ替え
                    int num = data[i];
                    data[i] = data[j];
                    data[j] = num;
                }
            }
        }
        System.out.println("並べ替えた後");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");

    }

}

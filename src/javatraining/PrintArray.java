//二次元配列の中身をそのまま表示する(9-9)

package javatraining;

public class PrintArray {

    public static void main(String[] args) {
        int[][] arr = {
                { 3, 1, 4, 1, },
                { 5, 9, 2, },
                { 6, 5, },
                { 3, },
        };
        printArray(arr);
    }
    /** arrの中身をそのまま表示するメソッド */
    public static void printArray(int[][] a) {
        //一行目の"{"を表示
        System.out.println("{");
        //配列の一文字目の"{"を左にタブ分の空白をあけて出力するのを繰り返す
        for (int i = 0; i < a.length; i++) {
            System.out.print("\t{");
            //配列内の数字を出力するのを繰り返す
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + ",");
            }
            System.out.println("},");
        }
        System.out.println("}");
    }

}

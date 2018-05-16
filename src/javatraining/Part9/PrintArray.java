package javatraining.Part9;

public class PrintArray {

    /*
     * 	問題9-9
     * 	整数型の二次元配列の内容を表示するプログラム
     */

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        /*
         * 整数型の二次元配列の初期化と代入
         */
        int[][] arr = {
                { 3, 1, 4, 1, },
                { 5, 9, 2, },
                { 6, 5, },
                { 3, },
        };
        printArry(arr);
        // 二次元配列の中身を出力するメソッド
    }

    public static void printArry(int[][] arr) {
        // 二次元配列の中身を出力するメソッド
        System.out.println("{");
        for (int i = 0; i < arr.length; i++) {
            // 縦の列
            System.out.print("\t{");
            for (int j = 0; j < arr[i].length; j++) {
                // 横の列
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println("},");
        }
        System.out.println("}");
    }

}

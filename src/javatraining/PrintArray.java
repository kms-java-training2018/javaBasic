package javatraining;

public class PrintArray {

    public static void main(String[] args) {
        // 変数設定
        // 配列
        int[][] arr = {
                { 3, 1, 4, 1, },
                { 5, 9, 2, },
                { 6, 5 },
                { 3, },
        };
        // 二次元配列の中身を表示するメソッド
        printArray(arr);
    }

    //--------------------------------------------
    // 二次元配列の中身を表示するメソッド
    // 引数 : 表示したい配列
    //--------------------------------------------
    public static void printArray(int[][] arr) {
        // 中身を表示する
        System.out.println("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("    {");
            for (int is : arr[i]) {
                System.out.print(is + ", ");
            }
            System.out.println("},");
        }
        System.out.println("}");
    }

}

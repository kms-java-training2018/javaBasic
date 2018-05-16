package javatraining;

/**
 * テキスト課題9-9
 * 二次元配列arrの内容を表示する
 */

public class PrintArray {

    public static void main(String[] args) {

        //int型の二次元配列arrを定義
        int[][] arr = {
                { 3, 1, 4, 1, },
                { 5, 9, 2, },
                { 6, 5, },
                { 3, }
        };

        //メソッドprintArrayを呼び出す
        printArray(arr);
    }

    //二次元配列arrを引数として渡す
    public static void printArray(int[][] arr) {

        //内容を表示
        System.out.println("{");

        //行の処理
        for (int i = 0; i < arr.length; i++) {

            //行のはじめ
            System.out.print(" { ");

            //列の処理
            for (int j = 0; j < arr[i].length; j++) {

                //arrの要素を表示
                System.out.print(arr[i][j] + ", ");
            }

            //行の終わり
            //改行
            System.out.println("},");
        }

        //内容の終わり
        System.out.println("}");
    }
}

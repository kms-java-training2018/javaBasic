package javatraining;

/**
 * 【p242 問題9-9】
 * int型二次元配列の内容を表示するメソッド
 * @author iyo-marina
 */

public class PrintArray {
    public static void main(String[] args) {

        // int型二次元配列arrを宣言し、まとめて初期化する
        int[][] arr = {
                {3,1,4,1,},
                {5,9,2,},
                {6,5,},
                {3,},
        };
        // 配列内容を表示するメソッドを呼び出し
        printArray(arr);
    }

    // 配列内容を表示するメソッドを宣言
    public static void printArray(int a [][]) {
        System.out.println("{");

        // 配列の行ごとに、列(値)を並べて表示する
        // a[i][j]で、iを行数、jを列数とする。
        for (int i = 0; i < a.length ; i++) {			// iを行数とし、すべて表示させる
            System.out.print("{");

            for (int j = 0; j < a[i].length; j++) {	// jを列数とし、その行が終わるまですべて表示させる
                System.out.print(a[i][j] + ", ");
            }
            System.out.println("},");
        }
        System.out.println("}");
    }

}

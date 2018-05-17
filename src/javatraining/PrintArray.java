package javatraining;

/**
 * 教科書　上　p.242
 * 問題9-9
 * 「printArrayを完成させましょう。」
 * */
public class PrintArray {

    public static void main(String[] args) {
        /*
         * 表示させる二次元配列を設定。
         * */
        int[][] arr = {
                { 3, 1, 4, 1 },
                { 5, 9, 2 },
                { 6, 5 },
                { 3, },
        };
        /*
         * printArrayメソッドを呼び出し
         * 引数array[][]を、配列arrで初期化する。
         * */
        printArray(arr); //
    }

    public static void printArray(int array[][]) { //???→int array[][]
        /*
         * 配列の表示
         * */
        System.out.println("{");
        /*
         * 1つ目のfor文は行ごとの処理。
         * */
        for (int i = 0; i < array.length; i++) { //???→array.length
            System.out.print("    {"); //???→"    {"
            for (int j = 0; j < array[i].length; j++) { //???→j < array[i].length
                System.out.print(array[i][j] + ","); //???→array[i][j] + ","
            }
            System.out.println("},"); //???→"},"
        }
        System.out.println("}");
    }

}

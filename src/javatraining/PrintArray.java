package javatraining;

public class PrintArray {

    public static void main(String[] args) {
        // 242p 9-9
        int[][] arr = {
                { 3, 1, 4, 1, },
                { 5, 9, 2, },
                { 6, 5, },
                { 3, },
        };
        printArray(arr);

    }

    public static void printArray(int[][] num) {	// mainメソッドの配列の型に合わせる
        System.out.println("{");	// 全体の大カッコ
        for (int i = 0; i < num.length; i++) {	// 配列の最後まで参照するよう繰り返す
            System.out.print("	{ ");	// 1次元目(?)の大カッコ
            for (int j = 0; j < num[i].length; j++) {	// 2次元目(?)の数値の数だけ繰り返す
                System.out.print(num[i][j] + ", ");	// 2次元目(?)の数値とコンマ出力
            }
            System.out.println("},");	// 1次元目(?)の大カッコ閉じ
        }
        System.out.println("}");	// 全体を閉じる大カッコ
    }

}

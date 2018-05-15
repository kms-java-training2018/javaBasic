package javatraining;

public class Printarray {

    public static void main(String[] args) {
        //二次元配列宣言
        int[][] arr = {
                { 3, 1, 4, 1, },
                { 5, 9, 2, },
                { 6, 5 },
                { 3,},

        };
        //メソッド
        printArray(arr);
    }//メソッド内容
    public static void printArray(int[][] n) {
        System.out.println("{");
        for (int i = 0; i < n.length; i++) {
            System.out.print("    {");
            for (int j = 0; j < n[i].length; j++) {
                System.out.print(n[i][j] + ", ");
            }
            System.out.println("},");
        }
        System.out.println("}");
    }

}

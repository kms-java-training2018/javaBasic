package javatraining;

public class SortData {

    //問題9-8  ソートプログラムを完成させよう

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        //配列の宣言
        int[] data = { 31, 41, 59, 26, 53, 58, 97, 93, 23, 84 };
        //並び替え前の配列表示
        System.out.println("並び替える前");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        //改行
        System.out.println("");

        //並び替え処理
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length  ; j++) {
                //もし左の数字が右の数字よりも大きければ入れ替え
                if (data[i] > data[j]) {
                    //変数xを用いてiとjの中身を交換
                    int x = 0;
                    x = data[i];
                    data[i] = data[j];
                    data[j] = x;

                }
            }
        }

        //並び替え後の表示
        System.out.println("並び替えた後");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");

    }

}



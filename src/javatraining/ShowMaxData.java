package javatraining;

public class ShowMaxData {

    //問題9-7  最大値を求めましょう

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        //配列の宣言
        int[] data = { 31, 41, 59, 26, 53, 58, 97, 93, 23, 84 };
        //変数宣言
        int max_data = data[0];

        //iが配列の長さになるまで繰り返し
        for (int i = 0; i < data.length; i++) {
            //右の数字が左の数字よりも大きければ、max_dataに代入
            if (data[i] > max_data) {
                max_data = data[i];
            }
        }

        //表示
        System.out.println("最大値は" + max_data + "です。");
    }

}

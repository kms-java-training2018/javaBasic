package javatraining;

/**
*
* 2018/05/14
* 三野進紀
* 9章 配列
* 3つ目の値を取り出し出力
*
* */

public class BinaryDigits1 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        //配列の宣言とそれぞれに値を格納
        int binaryDigits[] = new int[5];
        binaryDigits[0] = 1;
        binaryDigits[1] = 2;
        binaryDigits[2] = 4;
        binaryDigits[3] = 8;
        binaryDigits[4] = 16;

        //3つ目の値を変数に代入
        int output = binaryDigits[2];

        //3つめの値を出力
        System.out.println("3つめの値は" + output + "です。");
    }

}

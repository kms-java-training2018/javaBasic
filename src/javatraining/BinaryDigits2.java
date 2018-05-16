package javatraining;

/**
*
* 2018/05/14
* 三野進紀
* 9章 配列
* 配列の中の値をすべて出力
*
* */

public class BinaryDigits2 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        //配列の宣言とそれぞれに値を格納
        int binaryDigits[] = new int[5];
        binaryDigits[0] = 1;
        binaryDigits[1] = 2;
        binaryDigits[2] = 4;
        binaryDigits[3] = 8;
        binaryDigits[4] = 16;

        //5回繰り返し
        for (int i = 0; i < 5; i++) {

            //値を出力
            System.out.println((i + 1) + "つめの値は" + binaryDigits[i] + "です。");
        }
    }

}

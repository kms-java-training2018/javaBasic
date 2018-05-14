package javaBasic;


/**
 * 課題6-1
 * 3つ目の値を取り出す
 */

public class BinaryDigits1 {
    public static void main(String[] args) {

            //配列を宣言し、領域を確保する
            int binaryDigits[] = new int[5];

            //配列の要素に代入する
            binaryDigits[0] = 1;
            binaryDigits[1] = 2;
            binaryDigits[2] = 4;
            binaryDigits[3] = 8;
            binaryDigits[4] = 16;

            //配列の要素を出力する
            System.out.println("3つ目の値は"+ binaryDigits[2] +"です。");
    }
}

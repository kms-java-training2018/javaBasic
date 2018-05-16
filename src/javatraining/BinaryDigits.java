package javatraining;

/**
 *
 * 【講義内課題6-1】
 * 配列の3つ目の値を取り出す
 *
 * @author iyo-marina
 *
 */

public class BinaryDigits {

    public static void main(String[] args) {

        // 配列を宣言し、要素の個数を5個確保する（サイズを決定）
        int[] binaryDigits = new int[5];

        // 配列に値を代入
        binaryDigits[0] = 1;
        binaryDigits[1] = 2;
        binaryDigits[2] = 4;
        binaryDigits[3] = 8;
        binaryDigits[4] = 16;

        // 3つ目の値「4」を取り出す。
        System.out.println("3つ目の値は"+ binaryDigits[2] +"です。");

    }

}

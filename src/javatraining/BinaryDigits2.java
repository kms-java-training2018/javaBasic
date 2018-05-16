package javatraining;
 /**
  *
  * 【講義内課題6-2】
  * 講義内課題6-1の配列を使って
  * for文を使い、格納されている値をすべて出力。
  * @author iyo-marina
  *
  */

public class BinaryDigits2 {

    public static void main(String[] args) {

        // 配列を宣言し、要素の個数を5個確保する（サイズを決定）
        int[] binaryDigits = new int[5];

        // 配列に値を代入
        binaryDigits[0] = 1;
        binaryDigits[1] = 2;
        binaryDigits[2] = 4;
        binaryDigits[3] = 8;
        binaryDigits[4] = 16;

        // for文を使って格納されている値をすべて出力。
        for (int i = 0; i < binaryDigits.length; i++) {
            System.out.println( (i + 1) + "つ目の値は" + binaryDigits[i] + "です。");
        }

    }

}

package javatraining;

/**
 * ～課題6-2～
 * BinaryDigitsをfor文を用いて格納されている値を
 * 「○つ目の値は×です。」と全て出力する。
 * */
public class BinaryDigits2 {

    public static void main(String[] args) {
        /*
         * 配列の作成
         * */
        int binaryDigits[] = new int[5];
        binaryDigits[0] = 1;
        binaryDigits[1] = 2;
        binaryDigits[2] = 4;
        binaryDigits[3] = 8;
        binaryDigits[4] = 16;
        /*
         * [0]から順番に出力。
         * */
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "つ目の値は" + binaryDigits[i] + "です。");
        }
    }

}

package javatraining;

/**
 * ～課題6-1～
 * 5つの数値の入った配列を作成し、
 * 「3つ目の値は4です。」と出力する。
 * */
public class BinaryDigits1 {

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
        //出力
        System.out.println("3つ目の値は" + binaryDigits[2] + "です。");
    }

}

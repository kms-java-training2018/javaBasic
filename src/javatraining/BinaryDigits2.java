package javatraining;

public class BinaryDigits2 {
    public static void main(String[] args) {

        //配列
        int binaryDigits[] = new int[5];
        binaryDigits[0] = 1;
        binaryDigits[1] = 2;
        binaryDigits[2] = 4;
        binaryDigits[3] = 8;
        binaryDigits[4] = 16;

        //すべての値を出力する
        for (int i = 0; i < binaryDigits.length; i++) {
            System.out.println(i+1 + "つ目の値は" + binaryDigits[i] + "です。");
        }
    }
}

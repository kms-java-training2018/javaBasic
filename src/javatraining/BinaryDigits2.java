package javatraining;

public class BinaryDigits2 {
    public static void main(String[] args) {
        int binaryDigits[];

        //配列
        binaryDigits = new int[5];
        //要素
        binaryDigits[0] = 1;
        binaryDigits[1] = 2;
        binaryDigits[2] = 4;
        binaryDigits[3] = 8;
        binaryDigits[4] = 16;
        
        for (int i = 1; i < binaryDigits.length + 1; i++) {
            System.out.println(i + "つ目の値は" + binaryDigits[i - 1] + "です。");
        }
    }
}
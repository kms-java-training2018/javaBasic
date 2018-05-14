package javatraining;

public class BinaryDigits2 {
    public static void main(String[] args) {
        int binaryDigits[];

        binaryDigits = new int[5];
        binaryDigits[0] = 1;
        binaryDigits[1] = 2;
        binaryDigits[2] = 4;
        binaryDigits[3] = 8;
        binaryDigits[4] = 16;
        for (int i = 0; i < binaryDigits.length; i++);

        System.out.println("1つ目の値は" + binaryDigits[0] + "です。");
        System.out.println("2つ目の値は" + binaryDigits[1] + "です。");
        System.out.println("3つ目の値は" + binaryDigits[2] + "です。");
        System.out.println("4つ目の値は" + binaryDigits[3] + "です。");
        System.out.println("5つ目の値は" + binaryDigits[4] + "です。");
    }
}

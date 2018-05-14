package javatraining;

public class BinaryDigits2 {
    public static void main(String[] args) {
        // 変数設定
        int binaryDigits[] = new int[5];
        // 代入用変数
        int num = 1;
        // 初期値設定
        for (int i = 0; i < binaryDigits.length; i++) {
            binaryDigits[i] = num;
            num *= 2;
        }
        // 表示
        for (int i = 0; i < binaryDigits.length; i++) {
            System.out.println((i + 1) + "つめの値は" + binaryDigits[i] + "です");
        }
    }
}

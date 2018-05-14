package javatraining;

public class BinaryDigits2 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        // 5つの数値を格納する配列
        int binaryDigits[] = new int[5];

        // 数値の代入
        binaryDigits[0] = 1;
        binaryDigits[1] = 2;
        binaryDigits[2] = 4;
        binaryDigits[3] = 8;
        binaryDigits[4] = 16;

        // すべての結果の出力
        for (int i = 0; i < binaryDigits.length; i++) { // iが配列の長さより大きくなるまでループ
            // 結果の出力
            System.out.println((i + 1) + "つめの値は" + binaryDigits[i] + "です。");
        }
    }

}

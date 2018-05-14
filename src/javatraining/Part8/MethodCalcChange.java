package javatraining.Part8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodCalcChange {

    static final double TAX = 1.08;

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        // 引数とする数字を格納する変数を宣言
        int price = 0; // 入力された定価を格納
        int pay = 0; // 入力された支払額を格納
        int change = 0; // おつりを格納

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("定価を入力してください。");
            price = Integer.parseInt(reader.readLine());
            System.out.println("支払額を入力してください。");
            pay = Integer.parseInt(reader.readLine());
            // おつりを返すメソッドを呼び出す
            change = methodCalcTax(price, pay);

            if (change >= 0) {
                // おつりの値によって処理をわける
                // 結果を出力
                System.out.printf("おつりの値は%d円%n", change);
            } else {
                // おつりが足りないと出力
                System.out.println("どろぼーーー！！");
            }

        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("無効な値です。");
        }
    }

    public static int methodCalcTax(double price, int pay) {
        // おつりを返す
        // 戻り値の宣言
        int change = 0;
        // 税金の計算
        price = price * TAX;
        // おつりの計算
        change = pay - (int) price;
        return change;
    }
}

package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodCalcChange {

    public static void main(String[] args) {
        System.out.println("定価と支払額を入力してください");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int check = 0;
        int price = 0;
        int change = 0;
        int calc = 0;
        // 定価、支払額を入力
        try {
            while (check != 1) {
                System.out.println("定価を入力してください");
                String line = reader.readLine();
                price = Integer.parseInt(line);
                System.out.println("支払額を入力してください");
                line = reader.readLine();
                change = Integer.parseInt(line);
                if (price > change) {
                    // 定価と支払額チェック
                    System.out.println("支払額は定価より大きくしてください");
                } else {
                    check = 1;
                }
            }

            /**  定価に消費税を加えて支払額から引きおつりを出すメソッドを呼び出す*/
            calc = MethodCalcTax(price, change);
            if (calc < 0) {
                // 支払額不足の場合
                calc = -calc;
                System.out.println(calc + "円足りないです");
            } else if (price > 0){

                // 支払が足りた場合
                // 結果を出力
                System.out.println("おつりは" + calc + "円です");
            } else {
                //
                System.out.println("正しい数値を入力してください");
            }

        } catch (IOException e) {
            // 想定外のエラー
            System.out.println(e);
        } catch (NumberFormatException e) {
            // 数値以外を入力した場合
            System.out.println("正の整数を入力してください");
        }

    }

    /**  定価、支払額を引数として渡し、定価に消費税を加えて支払額から引きおつりを出すメソッド
     **  定数TAXで消費税を表記 */
    public static int MethodCalcTax(int price, int change) {
        final double TAX = 1.08;
        int calc = (int) (price * TAX);
        return calc = change - calc;
    }

}
package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodCalcChange {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            // 定価、支払額を入力してもらう
            // 定価の入力
            System.out.println("定価額を入力してください");
            String line = reader.readLine();
            int list_price = Integer.parseInt(line);

            // 支払額の入力
            System.out.println("支払額を入力してください");
            line = reader.readLine();
            int payment = Integer.parseInt(line);
            int change;

            // MethodCalcTaxを呼び出す
            change = MethodCalcTax(list_price, payment);

            //
            System.out.println("おつりは、 " + change + " 円です。");
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数値を入力してください");
        }
    }
    public static int MethodCalcTax(int list_price, int payment) {
        // 引数として受け取った定価に消費税を加えて売値を出す
        int plusTax = (int)(list_price * 1.08);

        // 引数として受け取った支払額から、上記売値を引く
        int result = payment - plusTax;
        return result;


    }

}

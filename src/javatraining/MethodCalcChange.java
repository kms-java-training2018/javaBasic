package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 定価、支払額を入力することで、
 * 売値（定価に消費税を加えた価格）と支払額から
 * おつりを算出するプログラム。
 * おつりが不足している場合はその旨を表示。
 * */
public class MethodCalcChange {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            /*
             * 定価、支払額を入力する。
             * */
            System.out.println("定価を入力してください。");
            //定価の入力値を変数listPriceへに代入
            String line = reader.readLine();
            int listPrice = Integer.parseInt(line);
            System.out.println("支払額を入力してください。");
            //支払額の入力値を変数paymentに代入。
            line = reader.readLine();
            int payment = Integer.parseInt(line);
            /*
             * おつりを出すメソッドmethodCalcTaxを呼び出す。
             * methodCalcTaxの計算結果が0以上の場合、おつりの出力。
             * 計算結果が0未満の場合、支払額不足の表示。
             * */
            if (methodCalcTax(listPrice, payment) >= 0) {
                System.out.println("おつりは" + methodCalcTax(listPrice, payment) + "円です。");
            } else {
                System.out.println("支払額が不足しています。");
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字を入力してください。");
        }
    }

    /*
     * 定価を売値に直しておつりの計算を行うメソッド
     * */
    public static int methodCalcTax(int x, int y) {
        //定価に消費税を加えた売値を変数sellingPriceに代入。
        double sellingPrice = x + x * 0.08;
        //支払額から売値を引いてだしたおつりをint型に変更して変数changeに代入。
        int change = (int) (y - sellingPrice);
        //おつりの結果を返す
        return change;
    }

}

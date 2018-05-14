package javatraining;

/**
 *
 * 2018/05/14
 * 三野進紀
 * 8章 メソッド
 * 定価と支払額を入力し、おつりを計算するプログラム
 *
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodCalcChange {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {

            //定価、支払額を入力
            System.out.println("定価を入力してください");
            String line = reader.readLine();
            int listPrice = Integer.parseInt(line);

            System.out.println("支払額を入力してください");
            line = reader.readLine();
            int pay = Integer.parseInt(line);

            //MethodCalcTaxを呼び出し
            int result = MethodCalcTax(listPrice, pay);

            //結果を出力
            System.out.println("おつりは" + result + "円です。");

        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数値を入力してください");
        }
    }

    /** 入力された支払い金額から、定価に消費税を加えた売値を引く*/
    public static int MethodCalcTax(int l, int p) {
        //引数として受け取った定価に消費税を加えて売値を出す
        double sell = l * 1.08;

        //引数として受け取った支払額から、上記売値を引く
        int change = p - (int) sell;

        //おつりを返す
        return change;
    }

}

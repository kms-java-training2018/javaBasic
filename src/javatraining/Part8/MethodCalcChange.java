package javatraining.Part8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodCalcChange {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        //定価、支払額を入力してもらう
        try{
            int listPrice;    //定価
            int payment;    //支払額

            System.out.println("定価を入力してください。");
            String line;
            line = reader.readLine();
            listPrice = Integer.parseInt(line);
            System.out.println("支払額を入力してください。");
            line = reader.readLine();
            payment = Integer.parseInt(line);


        /*定価、支払額を引数として渡し、定価に消費税(8%)を加えて
         * 支払額から引きおつりを出すメソッドを呼び出す
         */
        int change;
        change = MethodCalcTax(listPrice, payment);

        //結果を出力
        System.out.println("おつりは" + change + "円です。");

        } catch (IOException e) {
        } catch (NumberFormatException e) {
            System.out.println("数値ではありません。");
        }
    }

    public static int MethodCalcTax(int listPrice, int payment) {

        //引数として受け取った定価に消費税を加えて売値を出す
        double tax = 1.08;    //消費税
        double sellingPrice = 0;    //売値
        sellingPrice = listPrice * tax;



        //引数として受け取った支払額から、売値を引く
        int change;    //おつり
        change = payment - (int)sellingPrice;
        return change;
    }

}

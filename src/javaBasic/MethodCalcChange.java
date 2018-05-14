package javaBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodCalcChange {
     public static void main(String[] args) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                try {
                    //定価、支払額を入力してもらう

                    //定価の入力
                    System.out.println("定価を入力してください。");

                    //数字を読み込み、読み込んだ定価(引数)を格納する変数priceを宣言
                    String line1 = reader.readLine();
                    int price = Integer.parseInt(line1);

                   //支払額の入力
                    System.out.println("支払額を入力してください。");

                    //数字を読み込み、読み込んだ支払額(引数)を格納する変数paymentを宣言
                    String line2 = reader.readLine();
                    int payment = Integer.parseInt(line2);

                    //おつり(戻り値)格納用の変数を宣言
                    int change;

                    //MethodCalcTaxを呼び出す
                    change = (MethodCalcTax(price,payment));

                    //結果を出力
                    System.out.println("おつりは"+ change +"円です。");

                } catch (IOException e) {
                    System.out.println(e);
                } catch (NumberFormatException e) {
                    System.out.println("数字の形式が正しくありません。");
                }
            }
            /*引数として受け取った定価に消費税を加えて売値を出し、
           その売値を支払額からひいて、おつりを出すメソッド*/
            public static int MethodCalcTax(int m,int n) {
                return n - (m * 108 / 100) ;
            }
}

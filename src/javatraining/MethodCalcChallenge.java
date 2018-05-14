package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodCalcChallenge {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        //定価、支払額を入力
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("定価を入力してください。");
            String line = reader.readLine();
            int price = Integer.parseInt(line);
            System.out.println("支払額を入力してください。");
            String line2 = reader.readLine();
            int pay = Integer.parseInt(line2);


            //定価、支払額を引数として渡す。
            //消費税を加えお釣りの計算をする。
            int price2 = MethodCalcTax(price, pay);

            //結果出力
            System.out.println(pay + "円お預かりして" + price2 + "円のお返しです。");

        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字を入力してください。");
        }
    }

    //引数として受け取った定価に消費税加算
    //お釣り計算
    public static int MethodCalcTax(int price, int pay) {
        int tax = (price * 108) / 100;
        return pay - tax;

    }

}

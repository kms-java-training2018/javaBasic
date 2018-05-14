package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodCalcChange {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {

            //定価、支払額を入力してもらう
            System.out.println("定価を入力してください。");
            int listPrice = Integer.parseInt(reader.readLine());
            System.out.println("支払額を入力してください。");
            int payment = Integer.parseInt(reader.readLine());

            //定価、支払額を引数として渡し、定価に消費税を加えて支払額から引き、
            //お釣りを出すメソッドを呼び出す
            int change;

            change = MethodCalcTax(listPrice, payment);

            //結果を出力
            System.out.println("お釣りは" + change + "円です。");

        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字の形式が正しくありません。");
        }
    }

    public static int MethodCalcTax(int listPrice, int payment) {
        int result = (int) (payment - listPrice * 1.08);

        return result;
    }
}

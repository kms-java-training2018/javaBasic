package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodCalcChange {

    public static void main(String[] args) {
        // readLineメソッドを扱う準備
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // コンソールに入力された文字列を格納する変数を宣言
        String line;
        try {

            // 引数とする数字を格納する「定価」「支払額」の変数を宣言
            int listPrice, payment;

            // MethodCalcTaxからの戻り値を格納する「お釣」の変数を宣言
            double change;

            // 「定価」の入力を求める
            System.out.println("定価を入力してください。");
            // コンソールに入力された文字列を格納する
            line = reader.readLine();
            // コンソールに入力された文字列を数字に変換し、「定価」の変数に代入
            listPrice = Integer.parseInt(line);

            // 「支払額」の入力を求める
            System.out.println("支払額を入力してください。");
            // コンソールに入力された文字列を格納する
            line = reader.readLine();
            // コンソールに入力された文字列を数字に変換し、「支払額」の変数に代入
            payment = Integer.parseInt(line);

            // MethodCalcTaxを呼び出し、「お釣」の変数に代入
            change = MethodCalcTax(listPrice, payment);

            // 結果を出力する
            System.out.println("お釣りは" + change + "円です。");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("数字を入力してください。");
        }
    }

    /** お釣りを計算するメソッド */
    public static double MethodCalcTax(int listPrice, int payment) {
        // 引数として受け取った「定価」に消費税を加えて「売値」をだす
        double sellingPrice = listPrice * 1.08;

        // 引数として受け取った「支払額」から上記「売値」を引く
        double change = payment - sellingPrice;

        // 結果を戻す
        return change;
    }
}

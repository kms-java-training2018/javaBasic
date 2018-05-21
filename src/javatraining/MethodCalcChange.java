package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodCalcChange {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        //定価の支払額を記入してもらう
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("定価の支払額を記入してください。");

        String Line;
        try {
            Line = reader.readLine();
            int teika = Integer.parseInt(Line);
            int shiharaigaku;
            Line = reader.readLine();
            shiharaigaku = Integer.parseInt(Line);
            //定価、支払額を引数として渡し、定価に消費税を加えて支払額から引きおつりを出すメソッドを呼び出す
            int q = methodCaoTax(teika, shiharaigaku);
            //結果を出力
            System.out.println(q);

        } catch (IOException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }
    }
    public static int methodCaoTax(int q,int p) {

        //引数として受け取った定価に消費税を加えて売値を出す。
        int sales = (int) (q * 1.08);

        //引数として受け取った支払額から、上記売値を引く
        int oturi = p-sales;
        return oturi;
    }
}

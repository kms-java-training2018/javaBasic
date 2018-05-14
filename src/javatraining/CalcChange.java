package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcChange {
	
    public static void main(String[] args) {

        //-------------------------------------------------------------
        // 変数設定
        //-------------------------------------------------------------

        // 入力用変数初期化
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 定価
        int price;
        // 支払額
        int payment;
        // おつり
        int change;
        // 売値
        int sell; 

        //---------------------------------------------------------------
        // 計算開始
        //---------------------------------------------------------------
        try {
            // 定価を入力してもらう。
            System.out.println("定価を入力してください");
            price = Integer.parseInt(reader.readLine());
            // 支払額をを入力してもらう。
            System.out.println("支払額を入力してください");
            payment = Integer.parseInt(reader.readLine());
            // 売値を計算するメソッド
            sell = MethodCalcTax(price);
            // おつりを取り出すメソッド
            change = MethodCalcSalse(sell, payment);
            
            // 結果の出力
            if (change >= 0) {
                // 料金が足りていた場合
                System.out.println("定価" + price + "の商品を" + payment
                        + "円で購入したときのおつりは" + change + "円です。");
            } else {
                // 料金が足りていなかった場合
                System.out.println("定価" + price + "の商品を買うには支払額が"
                        + -change + "円ほど足りません。");
            }
        } catch (IOException e) {
            //入力時想定外のことがおきたとき
            System.err.println("エラー : 想定外の入力がされました");
            System.err.println(e);
        } catch (NumberFormatException e) {
            //数値入力の際数値以外を入れられたとき
            System.err.println("エラー : 正しい数値を入力してください");
            System.err.println(e);
        }
    }

    //----------------------------------------------------
    // 販売メソッド
    // 引数 : 売値、支払額
    // 返数 : おつり
    //----------------------------------------------------
    public static int MethodCalcSalse(int sell, int payment) {
        // 引数として、受け取った支払額から、売値を引く。
        int change = payment - sell;
        // おつりを返す。
        return change;
    }
    
  //----------------------------------------------------
    // 販売メソッド
    // 引数 : 定価
    // 返数 : 売値
    //----------------------------------------------------
    public static int MethodCalcTax(int price) {
        // 売値を計算して返す
        return (int)((double) price * 1.08);
    }
}

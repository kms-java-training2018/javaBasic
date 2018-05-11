package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Practice3 {

    public static void main(String[] args) {
        System.out.println("問題3");
        //入力用変数初期化
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            //入力された値を数値に変換し数値かどうか判定
            System.out.println("バイト数を入力してください");
            int num = Integer.parseInt(reader.readLine());
            //ビット数格納の後表示
            int bit = num * 8;
            System.out.println(bit + "ビット");
            //小数点以下計算用変数
            BigDecimal bite = new BigDecimal((double)num);
            //キロバイト格納の後、表示
            BigDecimal kiro = bite.scaleByPowerOfTen(-3);
            System.out.println(kiro.toPlainString() + "キロバイト");
            //メガバイト格納の後、表示
            BigDecimal mega = bite.scaleByPowerOfTen(-6);
            System.out.println(mega.toPlainString() + "メガバイト");
            //ギガバイト格納の後、表示
            BigDecimal giga = bite.scaleByPowerOfTen(-9);
            System.out.println(giga.toPlainString() + "ギガバイト");
            //テラバイト格納の後、表示
            BigDecimal tera = bite.scaleByPowerOfTen(-12);
            System.out.println(tera.toPlainString() + "テラバイト");
        } catch (IOException e) {
            //入力時想定外のことがおきたとき
            System.out.println(e);
        } catch (NumberFormatException e) {
            //数値入力の際数値以外を入れられたとき
            System.out.println("整数で入力してください");
        }
    }

}

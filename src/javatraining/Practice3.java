package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/*
 * 問題2
 * コンソール上から入力した数値(バイト数)をビット、キロバイト、ギガバイト、テラバイト
 * の単位に計算してそれぞれコンソール上に表示せよ。
 */

public class Practice3 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        System.out.println("数値を入力してください");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int input;
            input = Integer.valueOf(reader.readLine());

            // 計算
            // ビット計算
            Long bit = (long) input * 8;

            // キロバイト計算
            Double kbyte = (double) input / Math.pow(10,3);

            // メガバイト計算
            String mbyte = BigDecimal.valueOf((double) input / Math.pow(10,6)).toPlainString();

            // ギガバイト計算
            String gbyte = BigDecimal.valueOf((double) input / Math.pow(10,9)).toPlainString();

            // テラバイト計算
            String tbyte = BigDecimal.valueOf((double) input / Math.pow(10,12)).toPlainString();

            // 画面表示
            System.out.println(bit + "ビット");
            System.out.println(kbyte + "キロバイト");
            System.out.println(mbyte + "メガバイト");
            System.out.println(gbyte + "ギガバイト");
            System.out.println(tbyte + "テラバイト");

        } catch (IOException e) {
            System.out.println(e);
        }

    }

}

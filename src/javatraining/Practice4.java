package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;


public class Practice4 {

    public static void main(String[] args) {
        System.out.println("問題4");
        //入力用変数初期化
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            //バイト数入力
            System.out.println("数値を入力してください");
            String line = reader.readLine();
            //入力された値を数値に変換し数値かどうか判定
            int num = Integer.parseInt(line);
            // 秒(1分で60なので1時間で3600)
            long sec = num * 3600L;
            System.out.println(sec + "秒");
            // 分(1時間で60)
            long min = num * 60L;
            System.out.println(min + "分");
            // 人日(8時間で1)
            BigDecimal nindey = new BigDecimal((double)num / 8.0);
            System.out.println(nindey + "人日");
            // 人月(20日で1なので、160時間で1)
            BigDecimal ninmun = new BigDecimal((double)num / 160.0);
            System.out.println(ninmun + "人月");

        } catch (IOException e) {
            //入力時想定外のことがおきたとき
            System.out.println(e);
        } catch (NumberFormatException e) {
            //数値入力の際数値以外を入れられたとき
            System.out.println("数値を入力してください");
        }
    }
}

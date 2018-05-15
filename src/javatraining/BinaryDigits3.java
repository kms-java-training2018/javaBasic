package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* 2018/05/15
* 三野進紀
* エクセル課題①
* 5人分の点数を入力すると、それぞれの点数と平均点を表示するプログラム
* */

public class BinaryDigits3 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            //変数を宣言、初期化
            int score[] = new int[5];
            String line;
            int sum = 0;
            double ave = 0.0;

            //5回繰り返し
            for (int i = 0; i < 5; i++) {
                System.out.println((i + 1) + "人目の点数を入力して下さい。");
                //数を入力し、int型に変換
                line = reader.readLine();
                score[i] = Integer.parseInt(line);
            }
            //5回繰り返し
            for (int i = 0; i < 5; i++) {
                //5人の点数をそれぞれ表示
                System.out.println((i + 1) + "人目：" + score[i] + "点");
                //合計を算出
                sum += score[i];
            }
            //平均を算出し、表示
            ave = sum / score.length;
            System.out.println("班の平均点は" + ave + "点です。");

        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("不正な値が入力されました");
        }

    }

}

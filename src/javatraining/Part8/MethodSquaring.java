package javatraining.Part8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodSquaring {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        // 引数とする数字を格納する変数を宣言
        int p = 0; // 入力された数値を格納
        int q = 0; // 2乗された数値を格納
        int r = 0; // 4乗された数値を格納
        boolean endFlag = false; // 終了する判定を行う
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (!endFlag) {
            // 文字が入力されるまで繰り返す
            try {
                System.out.println("数値を入力してください。終了する場合は文字を入力してください。");
                p = Integer.parseInt(reader.readLine());
                // 引数を2乗し結果を返すメソッドを呼び出す
                q = square(p);
                r = square(square(p));
                //結果を出力
                System.out.printf("2乗の値は%d%n4乗の値は%d%n", q, r);
            } catch (IOException e) {
                System.out.println(e);
            } catch (NumberFormatException e) {
                endFlag = true;
                System.out.println("ばいばーい");
            }
        }
    }

    public static int square(int number) {
        /* 2乗を計算して返す*/
        // 戻り値の宣言
        int squaringNumber;
        // 2乗を計算
        squaringNumber = number * number;
        return squaringNumber;
    }
}

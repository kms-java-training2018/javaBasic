package javatraining.Part8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodSquaring {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        try {

        //引数とする数字を格納する変数を宣言
            int p;    //入力された値
            int q;    //2乗した値

        //引数を２乗し結果を返すメソッドを呼び出す
            String line;
            line = reader.readLine();
            p = Integer.parseInt(line);
            q = squaring(p);


        //結果を出力
            System.out.println(p + "の2乗は"+ q + "です。");

        } catch (IOException e) {
        } catch (NumberFormatException e) {
            System.out.println("数値ではありません。");
        }
    }

    public static int squaring(int p) {
        //計算して結果を返す
        int result = p * p;
        return result;
    }

}

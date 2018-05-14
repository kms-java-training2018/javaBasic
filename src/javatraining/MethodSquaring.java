package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodSquaring {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            //引数とする数字を格納する変数を宣言
            System.out.println("2乗の結果を知りたい数値を入力してください。");
            String line = reader.readLine();    //変数pの初期値を入力させる
            int p = Integer.parseInt(line);
            int q; //メソッドの結果を返す変数qを宣言
            //引数を2乗し結果を返すメソッドを呼び出す
            q = Squaring(p);
            //結果を出力
            System.out.println(p + "の2乗は" + q + "です。");
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字を入力してください。");
        }
    }

    public static int Squaring(int n) {
        //2乗の結果を出力。
        int j = 1;
        for(int i = 0; i< 2; i++) {
            j *= n;
        }
        //計算をして結果を返す
        return j;
    }

}

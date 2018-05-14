package javaBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodSquaring {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            try {
                //まず任意の数字の入力を指示
                System.out.println("数字を入力してください。");

                //数字を読み込み、読み込んだ数字(引数)を格納する変数pを宣言
                String line = reader.readLine();
                int p = Integer.parseInt(line);

                //戻り値格納用の変数を宣言
                int q;

                //引数を2乗し、結果を返すメソッドを呼び出す
                q = squaring(p);

                //結果を出力
                System.out.println(p +"の2乗は"+ q +"です。");

            } catch (IOException e) {
                System.out.println(e);
            } catch (NumberFormatException e) {
                System.out.println("数字の形式が正しくありません。");
            }
        }
        //引数を2乗し結果を返すメソッド
        public static int squaring(int n) {
            return n * n;
        }
}

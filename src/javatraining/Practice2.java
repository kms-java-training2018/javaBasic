package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice2 {

    public static void main(String[] args) {
        System.out.println("バイト数を入力してください。");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = reader.readLine();  //バイトの数値を取得
            long a = Integer.parseInt(line);
            double bit = a * 8;  //バイトをビットに変換して"bit"に代入
            double kb = a / 1000;  //バイトをキロバイトに変換して"kb"に代入
            double mb = kb / 1000;  //キロバイトをメガバイトに変換して"mb"に代入
            double gb = mb / 1000;  //メガバイトをギガバイトに変換して"gb"に代入
            double tb = gb / 1000;  //ギガバイトをテラバイトに変換して"tb"に代入
            System.out.println(a + " バイトは " + bit + " ビットです。");
            System.out.println(a + " バイトは " + kb + " キロバイトです。");
            System.out.println(a + " バイトは " + mb + " メガバイトです。");
            System.out.println(a + " バイトは " + gb + " ギガバイトです。");
            System.out.println(a + " バイトは " + tb + " テラバイトです。");
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数値が正しくありません。");
        }
    }

}

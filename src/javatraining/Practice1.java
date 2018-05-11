package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1 {

    public static void main(String[] args) {
        System.out.println("一つ目の数値を入力してください。");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = reader.readLine();  //一つ目の数値を取得
            int a = Integer.parseInt(line);
            System.out.println("二つ目の数値を入力してください。");
            line =reader.readLine();  //二つ目の数値を取得
            int b = Integer.parseInt(line);
            System.out.println(a+""+b);  //数値の間に空の文字列を挟む
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数値が正しくありません。");
        }
    }

}

package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 問題1
 * コンソール上から１つ目に入力した数値と、
 * 同じくコンソール上から２つ目に入力した数値を
 * 文字列として連結し、コンソール上に表示せよ。
 */

public class Practice1 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        System.out.println("1つめの数値を入力してください");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 入力された数値を文字列化
        try {
            String line;
            // 1つめの数値を入力
            line = reader.readLine();
            String A = line;

            // 2つめの数値を入力
            System.out.println("2つめの数値を入力してください。");
            line = reader.readLine();
            String B = line;

            // 文字の合体
            System.out.println(A + B);
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("おかしいです");
        }

    }

}

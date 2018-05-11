package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberHit {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            // 問題提起
            System.out.println("数を当ててね！(0～99)");

            // 正解の数を決める
            int kotae = (int)(Math.random() * 100);

            // プレイヤーの数値入力
            String line = reader.readLine();
            int player = Integer.parseInt(line);

            // 正解までに答えた数の計測するための変数定義
            int count = 1;

            // 不正解の場合ループに入る
            while ( kotae != player) {

                if( player > kotae) { // プレイやーの数字が答えよりも大きい場合
                    System.out.println("残念！もっと小さな数字です。");

                } else if( player < kotae) { // プレイヤーの数字が答えよりも小さい場合
                    System.out.println("残念もっと大きな数字です。");
                } else{

                }
            // 答えた数のカウント
            count++;

            // プレイヤーの数値入力
            line = reader.readLine();
            player = Integer.parseInt(line);
            }

            // 正解メッセージの出力
            System.out.println("正解です！");
            // 正解までに答えた数の出力
            System.out.println(count + "回目で正解できました。");
        } catch (IOException e) { // エラーメッセージ出力
            System.out.println(e);
        } catch (NumberFormatException e) { // 数値意外が入力されたときのエラーメッセージ
            System.out.println("数字を入力してください");
        }

    }

}

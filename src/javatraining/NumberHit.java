package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberHit{

    //数当てゲーム 数があたるまで繰り返す
    public static void main(String[] args) {
        //-----------------------------------------------
        //変数設定
        //-----------------------------------------------
        //Playerの入れた数値
        int Player;
        //当てたい数の数値
        int Enemy;
        //文字読み込み用変数
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //-----------------------------------------------
        //処理開始
        //-----------------------------------------------
        System.out.println("数をあててね！(0～99)");
        //当てたい数に1~99までの数値を入れる
        Enemy = (int) (Math.random() * 100);
        try {
            do {
                //文字を入力後数値に変換
                Player = Integer.parseInt(reader.readLine());
                //合っているかどうかを確認の後、標記を変える
                if (Player < 0 || 99 < Player) {
                    System.out.println("0～99までの数だよー");
                } else if (Player < Enemy) {
                    System.out.println("残念、もっと大きい数だよ");
                } else if (Player > Enemy) {
                    System.out.println("残念、もっと小さい数だよ");
                } else {
                    System.out.println("大正解！！答えは" + Enemy + "でした！！おめでとう");
                }
                //入力した数値と結果が同じならば処理を終了する
            } while (Enemy != Player);
        } catch (IOException e) {
            //何らかの例外処理が起きたとき
            System.out.println("例外処理が起きました");
            System.out.println(e);
        } catch (NumberFormatException e) {
            //数値以外を入れられたとき
            System.out.println("数値以外を入れないでください");
            System.out.println(e);
        }
    }

}

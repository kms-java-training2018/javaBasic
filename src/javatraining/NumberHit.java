/**
package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberHit {

    // [数あてゲーム]0～99の数字をあてるゲームです
    public static void main(String[] args) {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             try {
                 // 変数宣言
                 String line;
                 // 数字入力用変数
                 int number = 100;
                 // 当り数字用変数
                 int seikai = (int) (Math.random() * 100);
                 // 数当てwhile文の開始
                 while (number != seikai) {
                     // 数字の入力指示
                     System.out.println("数をあててね！(0~99)");
                     line =  reader.readLine();
                     number = Integer.parseInt(line);
                     // 正解判定
                     if (number == seikai) {
                         System.out.println("正解!");
                     } else if (number > seikai) {
                         System.out.println("残念!もっと小さな数字です");
                     } else if (number < seikai) {
                         System.out.println("残念!もっと大きな数字です");
                     }
                     // 正解判定ここまで
                 }
                 // 数当てwhile文ここまで
            } catch (IOException e) {
                System.out.println(e);
            } catch (NumberFormatException e) {
                System.out.println("数字が正しくありません。");

            }
    }

}
*/
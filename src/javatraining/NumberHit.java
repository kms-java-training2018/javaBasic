package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberHit {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));

        try{
            System.out.println("数をあててね！(0～99)");

            int i = (int)(Math.random()*101);
            String line = reader.readLine();
            int answer = Integer.parseInt(line);
            while (i == answer) {
                if (i < answer){
                System.out.println("残念!もっと小さな数字です");
                } else {
                    System.out.println("残念！もっと大きな数字です");
                }
                //再度入力待ち
                line = reader.readLine();
                answer = Integer.parseInt(line);
            }
            System.out.println("正解！");
        } catch (IOException e) {
        } catch (NumberFormatException e) {
            System.out.println("数字ではありません。");
        }
    }

}

package javatraining.Kadai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Janken {

    public static void main(String[] args) {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try {
        System.out.println("さいしょはグー！");
        System.out.println("じゃんけん！");
        System.out.println("0:グー");
        System.out.println("1:チョキ");
        System.out.println("2:パー");

        String line = reader.readLine();
        int input = Integer.parseInt(line);
        int opponent = (int)(Math.random()*3);

        //勝つパターン
        if(input == 0 && opponent == 1 || input == 1 && opponent == 2 || input == 2 && opponent == 0) {
            System.out.println("勝ちです。");
        //負けるパターン
        } else if (input == 0 && opponent == 2 || input == 1 && opponent == 0 || input == 2 && opponent == 1){
            System.out.println("負けです。");
        //あいこのパターン
        } else if (input == opponent) {
            System.out.println("あいこで！");

            //再度じゃんけん
            line = reader.readLine();
            input = Integer.parseInt(line);
            opponent = (int)(Math.random()*3);

            if(input == 0 && opponent == 1 || input == 1 && opponent == 2 || input == 2 && opponent == 0) {
                System.out.println("勝ちです。");
            } else if (input == 0 && opponent == 2 || input == 1 && opponent == 0 || input == 2 && opponent == 1){
                System.out.println("負けです。");
            } else if (input == opponent) {
                System.out.println("あいこです。ゲームオーバー");
            }
        }} catch(IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字の形式が正しくありません。");
        }
    }

}

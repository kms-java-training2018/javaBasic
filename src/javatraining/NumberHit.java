package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberHit {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {

            System.out.println("数をあててね！(0～99)");

            //入力値を変数inputとし、関係のない数値を格納しておく
            int input = 10000;

            //pc側からの数値(ランダム)を変数pcとする
            int pc = (int)(Math.random() * 100) ;

            //数が一致するまで繰り返す
            while(input != pc){

                 //入力された数字を変数inputに格納
                  input = Integer.parseInt(reader.readLine());


                 //入力値が小さい場合
                if(input < pc) {
                    System.out.println("残念！もっと大きい数字です。");

                }

                //入力値が大きい場合
                else if(pc < input) {
                    System.out.println("残念！もっと小さい数字です。");

                }
             }
            //一致したので抜ける
            System.out.println("正解！");


        }catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字の形式が正しくありません。");
        }
    }
}

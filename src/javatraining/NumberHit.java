package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberHit {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            //0～99の範囲の数をランダムに設定
            int kazu = (int)(Math.random() * 100);

            System.out.println("数を当ててね!(0～99)");

            //変数宣言
            String line;
            int input;

            do {
                System.out.println("0～99の範囲でお願いします");

                //数を入力。int型に変換
                line = reader.readLine();
                input = Integer.parseInt(line);

            //範囲外の数字の場合、入力しなおし
            }while(input > 99 || input < 0) ;

            //入力した数と設定されている数が違う場合、繰り返し
            while(input != kazu) {
                //小さい場合、小さいことを教える
                if(kazu < input) {
                    System.out.println("残念!もう少し小さいよ");
                }
                //大きい場合、大きいことを教える
                else if(kazu > input) {
                    System.out.println("残念!もうちょっと大きいよ");
                }

                //入力のしなおし
                line = reader.readLine();
                input = Integer.parseInt(line);
            }
            System.out.println("大正解!おめでとう");

        }catch(IOException e) {
            System.out.println(e);
        }catch(NumberFormatException e) {
            System.out.println("数字をお願いします");
        }

    }

}

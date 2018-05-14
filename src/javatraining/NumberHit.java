package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberHit {

    /**
     * ～～数当てゲーム～～
     * 0～99の整数をランダムで設定し、
     * プレイヤーに正解するまで入力させるゲーム。
     * プレイヤーが正解したら、褒めて終了。
     * */
    public static void main(String[] args) {
        int answer = 1000;
        /*
         * "answer"はプレイヤーの入力値を入れる変数。
         * while文の設定のために"number"がなり得ない整数を初期値に設定。
         * */
        int number = (int)(Math.random() * 100);
        /*
         * "number"は正解の数字を入れる変数。
         * そのゲーム内で変わってはいけないため、while文の前に設定。
         * */
        System.out.println("数を当ててね！(0～99)");
         BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        try {
            while (number != answer) {
                /*
                 * 正解と入力値が一致していない間繰り返す。
                 * 一致していない場合は正解との大小関係を表示。
                 * */
                String line = reader.readLine();
                answer = Integer.parseInt(line);
                if(number > answer) {
                    System.out.println("正解の数字よりも小さいです……。");
                    System.out.println("がんばって～");
                }else if(number < answer){
                    System.out.println("正解の数字よりも大きいです……。");
                    System.out.println("がんばって～");
                }
            }
            System.out.println("正解です！やるやん。");
        }catch(IOException e) {
            System.out.println(e);
        }catch(NumberFormatException e) {
            System.out.println("数字の形式が正しくありません。");
        }
    }

}

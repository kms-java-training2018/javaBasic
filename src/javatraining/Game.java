package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("最初はグー！");
            System.out.println("じゃんけん！");
            System.out.println("0:グー \n1:チョキ \n2:パー");

            //自分の手
            int hand = Integer.parseInt(reader.readLine());

            //相手の手
            int pc = (int)(Math.random() * 3);
            System.out.println(pc);

            //条件分岐

            //自分と相手の手が違う場合
                if (hand != pc) {

                    //勝ち
                    if((hand == 0)&&(pc == 1) || (hand == 1)&&(pc == 2)|| (hand == 2)&&(pc == 0)) {
                        System.out.println("あなたの勝ちです！");
                    }

                    //負け
                    else if((hand == 0)&&(pc == 2) || (hand == 1)&&(pc == 0)|| (hand == 2)&&(pc == 1))
                        {System.out.println("あなたの負けです、、、");

                    }else {    //それ以外
                        System.out.println("入力が正しくないです。");
                           }

               } else { //あいこなので二回目へ

                    System.out.println("あいこで");

              //自分の手
                    int hand2 = Integer.parseInt(reader.readLine());

              //相手の手
                    int pc2 = (int)Math.random() * 3;

                        //勝ち
                        if((hand2 == 0)&&(pc2 == 1) || (hand2 == 1)&&(pc2 == 2)|| (hand2 == 2)&&(pc2 == 0)) {
                            System.out.println("あなたの勝ちです！");
                        }

                        //負け
                        else if((hand2 == 0)&&(pc2 == 2) || (hand2 == 1)&&(pc2 == 0)|| (hand2 == 2)&&(pc2 == 1)) {
                            System.out.println("あなたの負けです、、、");
                        }

                        //あいこ
                        else if((hand2 == 0)&&(pc2 == 0) || (hand2 == 1)&&(pc2 == 1)|| (hand2 == 2)&&(pc2 == 2)) {
                             System.out.println("あいこです！\nゲームオーバー！");
                        }
                }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字の形式が正しくありません。");
        }
    }
}

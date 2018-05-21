package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Janken {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

         BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));

            try {

                System.out.println("最初はグー！" + "\n" + "じゃんけん！");
                System.out.println("0:グー" + "\n" + "1:チョキ" + "\n" + "2:パー");

                //自分が出す技と相手の技(ランダム)を入力。
                String line = reader.readLine();
                int jibun = Integer.parseInt(line);
                int aite = (int)(Math.random() * 3);

                //自分が出した技を出力
                if(jibun == 0) {
                    System.out.println("自分：グー");
                }else if(jibun == 1) {
                    System.out.println("自分：チョキ");
                }else if(jibun == 2) {
                    System.out.println("自分：パー");
                }else {
                    System.out.println("自分：0～2の範囲で入力してください");
                }

                //相手の技を出力
                if(aite == 0) {
                    System.out.println("相手：グー");
                }else if(aite == 1) {
                    System.out.println("相手：チョキ");
                }else if(aite == 2) {
                    System.out.println("相手：パー");
                }else {
                    System.out.println("相手：0～2の範囲で入力してください");
                }

                //それぞれの技にあった場合
                if(jibun == 0) {
                    if(aite == 1) {
                        System.out.println("あなたの勝ちです！");
                    }else if(aite == 2) {
                        System.out.println("あなたの負けです...");
                    }
                }else if(jibun == 1){
                    if(aite == 2) {
                        System.out.println("あなたの勝ちです！");
                    }else if(aite == 0) {
                        System.out.println("あなたの負けです...");
                    }
                }else if(jibun == 2) {
                    if(aite == 0) {
                        System.out.println("あなたの勝ちです！");
                    }else if(aite == 1) {
                        System.out.println("あなたの負けです...");
                    }
                }

                //あいこだった場合、もう一回
                if(jibun == aite) {
                    System.out.println("あいこで");

                    String line2 = reader.readLine();
                    int jibun2 = Integer.parseInt(line2);
                    int aite2 = (int)(Math.random() * 3);

                    if(jibun2 == 0) {
                        System.out.println("自分：グー");
                    }else if(jibun2 == 1) {
                        System.out.println("自分：チョキ");
                    }else if(jibun2 == 2) {
                        System.out.println("自分：パー");
                    }else {
                        System.out.println("自分：0～2の範囲で入力してください");
                    }

                    if(aite2 == 0) {
                        System.out.println("相手：グー");
                    }else if(aite2 == 1) {
                        System.out.println("相手：チョキ");
                    }else if(aite2 == 2) {
                        System.out.println("相手：パー");
                    }else {
                        System.out.println("相手：0～2の範囲で入力してください");
                    }


                    if(jibun2 == 0) {
                        if(aite2 == 1) {
                            System.out.println("あなたの勝ちです！");
                        }else if(aite2 == 2) {
                            System.out.println("あなたの負けです...");
                        }
                    }else if(jibun2 == 1){
                        if(aite2 == 2) {
                            System.out.println("あなたの勝ちです！");
                        }else if(aite2 == 0) {
                            System.out.println("あなたの負けです...");
                        }
                    }else if(jibun2 == 2) {
                        if(aite2 == 0) {
                            System.out.println("あなたの勝ちです！");
                        }else if(aite2 == 1) {
                            System.out.println("あなたの負けです...");
                        }
                    }
                    if(jibun2 == aite2) {
                        System.out.println("あいこです。ゲームオーバー");
                    }

                }
        } catch(IOException e) {
            System.out.println(e);
        }catch(NumberFormatException e) {
            System.out.println("正しくありません");
        }
    }
}

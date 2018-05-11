//----------------------------------------------------------------------
//    入力した3つの数字が合っているか当てるゲーム
//    <<ルール>>
//    3つの数字はそれぞれ1～9の範囲であり、重複しない。
//    入力した数字が用意された数字と順番があっていたら、hit
//    入力した数字が用意された数字とあっていたら、blow
//    hitが3になったらゲーム終了
//-----------------------------------------------------------------------
package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HitBlow {

    //当てる数がいくつあるか
    final static int ANSERNUM = 3;

    public static void main(String[] args) {
        //-----------------------------------------------
        //変数設定
        //-----------------------------------------------
        // Playerが入れる数値
        int[] Player = new int[ANSERNUM];
        // 当てたい数の数値
        int[] Enemy = new int[ANSERNUM];
        // 何ターン目か表記用変数
        int Turn = 0;
        // 位置も数値も合っていた数
        int hit;
        // 数値だけ合っていた数
        int blow;
        //文字読み込み用変数
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //-----------------------------------------------
        //処理開始
        //-----------------------------------------------
        //当てる数が10を超えた場合ばらばらにすることが出来ないので10を超えないようにする
        if (ANSERNUM < 10) {
            System.out.println(ANSERNUM + "個の数を当ててね");
            System.out.println("");
            for (int i = 0; i < ANSERNUM; i++) {
                //当てたい数に1～9までの数値を入れる
                Enemy[i] = (int) (Math.random() * 10);
                for (int j = 0; j < i; j++) {
                    //同じ数値が入っているか確認し入っていた場合数値を上昇させない
                    if (Enemy[i] == Enemy[j]) {
                        //上昇させないように--を行う
                        i--;
                    }
                }
            }
            try {
                do {
                    //当たっていた数を初期化
                    hit = 0;
                    blow = 0;
                    //ターン数追加
                    Turn++;
                    System.out.println(Turn + "ターン目");
                    //数値入力
                    for (int i = 0; i < ANSERNUM; i++) {
                        System.out.println((i + 1) + "つ目の数を入れてね");
                        //文字を入力後数値に変換
                        Player[i] = Integer.parseInt(reader.readLine());
                        //想定していない数値を入れられた場合もう一度入れてもらう
                        if (Player[i] < 0 || 9 < Player[i]) {
                            System.out.println("1～9までの数値だよ？");
                            i--;
                        }
                    }

                    //三つの数と比べていく
                    for (int i = 0; i < ANSERNUM; i++) {
                        for (int j = 0; j < ANSERNUM; j++) {
                            //同じ数値があった場合
                            if (Enemy[i] == Player[j]) {
                                //さらに同じ場所ならばhitに追加違うならblowに追加
                                if (i == j) {
                                    hit++;
                                } else {
                                    blow++;
                                }
                            }
                        }
                    }

                    //hit数とblow数を表示
                    System.out.println("hit :" + hit);
                    System.out.println("blow:" + blow);

                    if (hit == ANSERNUM) {
                        // 全部当てれた場合
                        System.out.println("おめでとう！！クリアです！！");
                        System.out.println("ターン数:" + Turn);
                    } else {
                        // 外れていた場合
                        System.out.println("残念もう一回！！");
                    }

                    //入力した数値と結果が同じならば処理を終了する
                } while (hit != ANSERNUM);
            } catch (IOException e) {
                //何らかの例外処理が起きたとき
                System.out.println("例外処理が起きました");
                System.out.println(e);
            } catch (NumberFormatException e) {
                //数値以外を入れられたとき
                System.out.println("数値以外を入れないでください");
                System.out.println(e);
            }
        } else {
            System.out.println("当てる数が多すぎます、ゲームになりません");
        }
    }

}

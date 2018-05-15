package javatraining;

public class ArrayTest {

    public static void main(String[] args) {
        // 5/15オリジナルな課題そのに
        int scoreInt = 95;

        int[] scoreList = new int[3];
        scoreList[0] = 10;
        scoreList[1] = 20;
        scoreList[2] = 30;

        changeScore(scoreInt);

        changeScoreList(scoreList);

        //scoreIntの出力
        System.out.println(scoreInt);

        //scoreListの出力
        for(int score : scoreList) {
            System.out.println(score);
        }
     }

     /**
     * 受け取った変数に100を上書きする。
     */
     private static void changeScore(int score) {
        score = 100;
        /**
         * 基本型の変数を引数にしている。
         * 変数に格納された値をコピーしてこのメソッドのscoreに代入後、
         * このメソッドのscoreに100を代入しているだけなので
         * mainメソッドのscoreの値は変化しない。
         */
     }

     /**
     * 受け取った配列の中身全てに100を上書きする。
     */
     private static void changeScoreList(int[] scoreList) {
             scoreList[0] = 100;
             scoreList[1] = 100;
             scoreList[2] = 100;
             /**
              * 参照型の配列を引数にしている。
              * この時点で同じメモリを参照することになっているので
              * メソッド内のscoreListを変更すると同じ箇所を参照している
              */
     }


    }


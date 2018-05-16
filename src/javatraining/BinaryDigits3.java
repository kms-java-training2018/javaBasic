package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryDigits3 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        // スコア格納用の配列の宣言と初期化
        int score[] = new int[5];

        // 合計値格納用の変数
        int sum = 0;

        // 平均点格納用の変数
        double average = 0;

        // BufferedReaderクラスの宣言
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            for (int i = 0; i < score.length; i++) {
                // 5人のテストのスコアを入力
                System.out.println((i + 1) + "人目の値を入力してください");
                score[i] = Integer.parseInt(reader.readLine());
            }
            for (int i = 0; i < score.length; i++) {
                // 5人のテストのスコアを出力
                System.out.println((i + 1) + "人目：" + score[i] + "点");
                sum += score[i];
            }

            // 平均点を計算
            average = sum / score.length;

            // 平均点の出力
            System.out.println("班の平均点は" + average + "点です。");

        } catch (IOException e) {
            // 例外処理
            System.out.println(e);
        } catch (NumberFormatException e) {
            // 数値以外が入力された場合
            System.out.println("不正な値が入力されました。");
        }
    }

}

package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircleCalc {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 入力して数値を格納する変数宣言
        String line;
        // 半径の入力を求める
        System.out.println("半径を入力してください。");
        try {
            line = reader.readLine();
            // 入力した文字列を数字に変換
            int radius = Integer.parseInt(line);

            // 入力した半径を使い円を作る
            Circle c1 = new Circle(radius);

            // 固定値を使い円を作る
            Circle c2 = new Circle();

            // ２つの円の面積の和を出力
            System.out.println("円の面積の和は" + (c1.circle1() + c2.circle1()));
            // ２つの円の円周の和を出力
            System.out.println("円の円周の和は" + (c1.circle2() + c2.circle2()));
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字が正しくありません。");
        }
    }

}

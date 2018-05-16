package javatraining;

/**
* 2018/05/16
* 三野進紀
* Circleクラスを利用して
* 2つの円の面積の和と演習の和を求めるプログラム
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircleCalc {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        /*一つ目の円*/
        //一つ目の円の面積と円周用の変数を宣言
        double c1Area, c1CircumFerence;

        //Circleクラスのインスタンスc1を作成
        Circle c1 = new Circle();

        //面積を得るメソッドを呼び出して、その値で変数を初期化
        c1Area = c1.getArea();
        //円周を得るメソッドを呼び出して、その値で変数を初期化
        c1CircumFerence = c1.getCircumFerence();

        //一つ目の円の面積と円周を出力
        System.out.println("一つ目の円の面積は" + c1Area + "です。");
        System.out.println("一つ目の円の円周は" + c1CircumFerence + "です。");

        /*二つ目の円*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            //二つ目の円の面積と半径と円周用の変数を宣言
            double c2radius, c2Area, c2CircumFerence;

            //半径を入力して、double型に変換。その値でc2radiusを初期化
            String line;
            System.out.println("二つ目の円の半径を入力してください");
            line = reader.readLine();
            c2radius = Double.parseDouble(line);

            //Circleクラスのインスタンスc2を作成
            Circle c2 = new Circle(c2radius);

            c2Area = c2.getArea();
            c2CircumFerence = c2.getCircumFerence();

            //二つ目の円の面積と円周を出力
            System.out.println("二つ目の円の面積は" + c2Area + "です。");
            System.out.println("二つ目の円の円周は" + c2CircumFerence + "です。");

            //合算用の変数宣言
            double sumArea, sumCircumFerence;
            sumArea = c1Area + c2Area;
            sumCircumFerence = c1CircumFerence + c2CircumFerence;

            //出力
            System.out.println("円の面積の和は" + sumArea + "です。");
            System.out.println("円の円周の和は" + sumCircumFerence + "です。");

        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数値を入力してください");
        }

    }

}

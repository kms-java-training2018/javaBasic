package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircleCalc {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("半径を数値で入力してください。");

            //入力値をint型で取得
            int n = Integer.parseInt(reader.readLine());

            //入力された半径を持つ円
            Circle c1 = new Circle(n);

            System.out.println("あなたが入力した半径の円の面積は" + c1.getArea() + "です。");
            System.out.println("あなたが入力した半径の円の円周は" + c1.getLength() + "です。");
            System.out.println("");

            //半径10の円
            Circle c2 = new Circle();

            System.out.println("半径10の円の面積は" + c2.getArea() + "です。");
            System.out.println("半径10の円の円周は" + c2.getLength() + "です。");
            System.out.println("");

            //合計を出す

            //面積
            int areaSum = c1.getArea() + c2.getArea();

            //円周
            int lengthSum = c1.getLength() + c2.getLength();

            System.out.println("2つの円の面積の和は" + areaSum + "です。");
            System.out.println("2つの円の円周の和は" + lengthSum + "です。");

        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字の形式が正しくありません。");
        }

    }

}

package javatraining;

public class Circle {
    //-----------------------------------
    // フィールド
    //-----------------------------------
    // 半径を格納する
    int radius;
    // 円周率を格納する
    int pi = 3;
    //------------------------------------
    // メソッド
    //------------------------------------
    // 固定の数値を半径に代入
    Circle() {
        radius = 10;
    }

    // 任意の数値を半径に代入
    Circle(int n) {
        radius = n;
    }

    // 円の面積を求める
    int circle1() {
        return radius * radius * pi;
    }

    // 円周求める
    int circle2() {
        return radius * 2 * pi;
    }
}

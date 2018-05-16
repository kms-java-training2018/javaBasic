package javatraining;

public class Circle {
    // フィールド
    double radius;
    static final double pi = 3.14;


    // コンストラクタ①：インスタンス作成時に引数なし
    Circle() {
        radius = 10;
    }

    // コンストラクタ②：インスタンス作成時に引数として半径を受け取る
    Circle(double r) {
        radius = r;
    }



    // 面積を求めるメソッド
    double getArea() {
        return radius * radius * pi;
    }

    // 円周を求めるメソッド
    double getCircumference() {
        return radius * 2 * pi;
    }

}

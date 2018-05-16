package javatraining;

public class Circle {
    /**
     * フィールド
     */
    double radius;
    final static double PI = 3.14;

    /**
     * コンストラクタ
     */
    public Circle() {
        radius = 10;
    }

    public Circle(double r) {
        radius = r;
    }

    /**
     * メソッド
     */
    double getArea() {
        return radius * radius * PI;
    }

    double getCircumference() {
        return 2 * radius * PI;
    }

}

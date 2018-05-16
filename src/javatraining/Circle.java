package javatraining;

public class Circle {
    //円周率
    static double pi = 3.14;

    //半径
    int radius;

    //半径を設定する
    void setSize(int r) {
        radius = r;
    }

    //引数なしコンストラクタ
    Circle() {
        setSize(10);
    }

    //引数付きコンストラクタ
    Circle(int r) {
        setSize(r);
    }

    //面積を計算する
    int getArea() {
        return (int) (radius * radius * pi);
    }

    //円周を計算する
    int getLength() {
        return (int) (radius * 2 * pi);
    }

}

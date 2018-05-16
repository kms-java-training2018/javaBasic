package javatraining;

public class Circle {

    //変数宣言
    int radius; //半径
    int pi = 3 ; //円周率3

    //引数なしコンストラクタ
    Circle() {
        setSize(10);
    }

    //引数ありコンストラクタ
    Circle(int r) {
        setSize(r);
    }

    //setSizeメソッド
    void setSize(int r) {
        radius = r;
    }

    //面積計算メソッド
    int getArea() {
        return radius * radius * pi;
    }

    //円周計算メソッド
    int getCircumference() {
        return 2 * radius * pi;
    }

}
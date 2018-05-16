package javatrainig;

public class Circle {
    //フィールドを宣言
    int radius;
    int pi = 3;

    //引数がない場合:()がない
    Circle() {
        setSize(10);
    }

    //引数がある場合
    Circle(int r) {
        setSize(r);
    }

    //setSizeをradiusに代入
    void setSize(int n) {
        radius = n;
    }

    //円周の長さの計算
    int getCircumferense() {
        return 2 * radius * pi;
    }
    //面積の計算
    int getArea() {
        return radius * radius * pi;
    }
}
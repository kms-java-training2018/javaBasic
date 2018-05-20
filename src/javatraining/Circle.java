package javatraining;

public class Circle {

    // フィールド設定
    // 変数定義
    // 円周率の設定
    static double pi = 3.14;

    // 半径値を入れるための変数
    double radius;

    // 半径値の入力がなかった場合
    Circle(){
        radius(10);
    }
    // 半径値の入力がある場合
    Circle(double m){
        radius(m);
    }

    // 引数を半径値として使う
    void radius(double r) {
        radius = r;
    }

    // 円の面積を求める
    double getArea() {
        return radius * radius * pi;
    }

    // 円の円周値を求める
    double getCircumFerence() {
        return radius * 2 * pi;
    }
}

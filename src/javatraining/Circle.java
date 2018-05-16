package javatraining;

/**
* 2018/05/16
* 三野進紀
* 円を表すCircleクラス
* 2つのコンストラクタを持つ
* 1つは数値を引数として受け取り、それを半径とする。
* もう1つは引数なしで、10が自動的に半径となる
* */

public class Circle {

    //フィールド
    double radius;
    double pi = 3.14;

    //引数なしで、10が自動的に半径となるコンストラクタ
    Circle() {
        radius = 10;

    }

    //setSizeメソッドを呼び出し、数値を引数として受け取り、それを半径とするコンストラクタ
    Circle(double r) {
        radius = r;

    }

    //面積を得るgetAreaメソッド
    double getArea() {
        return (int) (radius * radius * pi);
    }

    //円周を得るgetCircumFerenceメソッド
    double getCircumFerence() {
        return (int) (radius * 2 * pi);
    }

}

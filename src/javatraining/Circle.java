package javatraining;

/**
 * 円を表すクラス
 * */
class Circle {
    int radius;
    static double pi = 3.14;

    /*
     * インスタンス作成（引数無し）
     * */
    Circle() {
        setSize(10);
    }

    /*
     * インスタンス作成（引数有り）
     * */
    Circle(int r) {
        setSize(r);
    }

    void setSize(int r) {
        radius = r;
    }

    /*
     * 面積を求める
     * @return double型の面積の数値
     */
    double getArea() {
        return pi * radius * radius;
    }

    /*
     * 円周を求める
     * @return double型の円周の数値
     */
    double getCircumference() {
        return 2 * pi * (double) radius;
    }

}

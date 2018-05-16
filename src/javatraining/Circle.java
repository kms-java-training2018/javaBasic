package javatraining;

class Circle {
    int radius;
    static double pi = 3.14;


    Circle() {
        setSize(10);
    }
    Circle(int r) {
        setSize(r);
    }
    void setSize(int r) {
        radius = r;
    }
    //円の面積を求める
    double getArea() {
        return radius * radius * pi;
    }
    //円周を求める
    double getRound() {
        return 2 * radius * pi;
    }
}
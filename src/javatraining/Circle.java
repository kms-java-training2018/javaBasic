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
    double getArea() {
        return radius * radius * pi;
    }
    double getRound() {
        return 2 * radius * pi;
    }
}
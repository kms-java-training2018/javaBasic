package javatraining;

public class Circle {
    int radius;
    int pi;

    Circle() {
        setSize(5, 3);
    }

    Circle(int r, int p) {
        radius = r;
        pi = p;
    }
    void setSize(int r, int p) {
        radius = r;
        pi = p;
    }

    int getArea() {
        return radius * radius * pi;

    }int ensyuu() {
        return radius * 2 * pi;
    }

}

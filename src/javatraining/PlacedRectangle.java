package javatraining;

public class PlacedRectangle extends Rectangle {
    Rectangle r;
    int x;
    int y;

    PlacedRectangle() {
        r = new Rectangle();
        setLocation(0, 0);
    }

    PlacedRectangle(int x, int y) {
        r = new Rectangle();
        setLocation(x, y);
    }

    PlacedRectangle(int x, int y, int width, int height) {
        r = new Rectangle(width, height);
        setLocation(x, y);
    }

    void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[(" + x + ", " + y + ") " + r + "]";
    }

    public static void main(String[] args) {
        PlacedRectangle m = new PlacedRectangle(12, 34);
        System.out.println("m = " + m);
    }
}
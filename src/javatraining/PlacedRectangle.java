package javatraining;

public class PlacedRectangle extends Rectangle {
    // int型のフィールドx,yを設定
    int x;
    int y;

    // 引数が無い場合
    PlacedRectangle() {
        setLocation(0, 0);
    }

    // 位置付き(引数2つ)
    PlacedRectangle(int x, int y) {
        setLocation(x, y);
    }

    // 位置と大きさ付(引数4つ)
    PlacedRectangle(int x, int y, int width, int height) {
        super(width, height);
        setLocation(x, y);
    }

    void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[(" + x + ", " + y + ") " + super.toString() + "]";
    }

    public static void main(String[] args) {
        PlacedRectangle m = new PlacedRectangle(12, 34);
        System.out.println("m = " + m);
    }
}
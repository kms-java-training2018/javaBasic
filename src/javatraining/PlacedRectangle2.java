package javatraining;

public class PlacedRectangle2 {
    Rectangle r;
    int x;
    int y;

    //引数なし
    PlacedRectangle2() {
        r = new Rectangle();
        setLocation(0, 0);
    }

    //位置付き
    PlacedRectangle2(int x, int y) {
        r = new Rectangle();
        setLocation(x, y);
    }

    //位置と大きさ付き
    PlacedRectangle2(int x, int y, int width, int height) {
        r = new Rectangle(width, height);
        setLocation(x, y);
    }

    void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[" + "(" + x + "," + y + ")" + "[" + r + "]" + "]";
    }
}
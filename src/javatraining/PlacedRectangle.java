package javatraining;

public class PlacedRectangle extends Rectangle{
    int x;
    int y;

    //引数なし
    PlacedRectangle() {
        setLocation(0, 0);
    }
    //位置付き
    PlacedRectangle(int x, int y) {
        setLocation(x, y);
    }
    //位置と大きさ付き
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
        return "[" + "(" + x + "," + y + ")" + "[" + super.toString() + "]" + "]";
    }

}
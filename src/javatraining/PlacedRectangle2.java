package javatraining;

public class PlacedRectangle2 {
    /**
     * フィールド
     */
    Rectangle r;
    int x;
    int y;
    /**
     * コンストラクタ
     */
    public PlacedRectangle2() {
        r = new Rectangle();
    }
    public PlacedRectangle2(int x, int y) {
        setLocation(x, y);
    }
    public PlacedRectangle2(int x, int y, int width, int height) {
        r = new Rectangle(width, height);
        setLocation(x, y);
    }
    /**
     * メソッド
     */
    void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "[ (" + x + ", " + y + ") [" + r.width + ", " + r.height + "]]";
    }

}

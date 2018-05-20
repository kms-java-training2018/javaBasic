package javatraining;

public class PlacedRectangle2 {
    // 問題12-5
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
        // Rectangle型でキャストして明示的に書いてみたつもり
        return "[ (" + x + ", " + y + ") " + ((Rectangle)r).toString();
    }

}

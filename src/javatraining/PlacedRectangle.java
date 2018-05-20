package javatraining;

public class PlacedRectangle extends Rectangle {
    // 問題12-4
    /**
     * フィールド
     */
    int x;
    int y;
    /**
     * コンストラクタ
     */
    public PlacedRectangle() {
        super();	// 明示的に表記
    }
    public PlacedRectangle(int x, int y) {
        setLocation(x, y);
    }
    public PlacedRectangle(int x, int y, int width, int height) {
        super(width, height);
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
        // superにして明示的に書いてみたつもり
        return "[ (" + x + ", " + y + ") " + super.toString();
    }

}

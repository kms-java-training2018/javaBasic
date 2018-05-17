package javatraining;

/**
 *
 * @author mitsuno-shinki
 * 2018/05/17
 * Rectangleクラスのメソッドを呼び出し、位置と大きさの情報を得る
 *
 */

public class PlacedRectangle extends Rectangle {

    /**
     * フィールド
     */
    int x;
    int y;

    /**
     * 引数なしコンストラクタ
     */
    PlacedRectangle() {
        setLocation(0, 0);
    }

    /**
     * 位置付きコンストラクタ
     * @param x
     * @param y
     */
    PlacedRectangle(int x, int y) {
        setLocation(x, y);
    }

    /**
     * 位置と大きさ付きコンストラクタ
     * @param x
     * @param y
     * @param width
     * @param height
     */
    PlacedRectangle(int x, int y, int width, int height) {
        setLocation(x, y);
        setSize(width, height);
    }

    /**
     * 位置を変更するメソッド
     * @param x
     * @param y
     */
    void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * 標準的な文字列表現を返すメソッド
     */
    @Override
    public String toString() {
        return "[ (" + x + ", " + y + ") "+ super.toString()+"]";
    }

    /**
     * メインメソッド
     * @param args
     */
    public static void main(String[] args) {
        PlacedRectangle place = new PlacedRectangle(20, 30, 40, 50);
        System.out.println(place.toString());
    }

}

package javatraining;
/**
 * テキスト課題12-5です。
 * @author noda-ayumi
 *
 */
public class PlacedRectangle2 {

    //int型の変数を宣言
    int x;
    int y;

    Rectangle r = new Rectangle();

    //引数なしコンストラクタ
    PlacedRectangle2() {
        setLocation(0, 0);
    }

    //位置付きコンストラクタ
    PlacedRectangle2(int x, int y) {
        setLocation(x, y);
    }

    //位置と大きさ付きコンストラクタ
    PlacedRectangle2(int x, int y, int width, int height) {
        r.setSize(width, height);
        setLocation(x, y);
    }

    //位置を変更するメソッド
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //標準的な文字列表現を返すメソッド
    @Override
    public String toString() {
        return "[ (" + x + ", " + y + ") " + r + "]";

    }

    public static void main(String[] args) {
        PlacedRectangle2 p1 = new PlacedRectangle2();
        PlacedRectangle2 p2 = new PlacedRectangle2(12, 34);
        PlacedRectangle2 p3 = new PlacedRectangle2(12, 34, 123, 45);
        p3.setLocation(56, 78);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }

}

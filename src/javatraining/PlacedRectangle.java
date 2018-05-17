//問題12-4

package javatraining;

//RectangleのサブクラスとしてPlacedRectangleを宣言
public class PlacedRectangle extends Rectangle {

    //位置を表すint型のフィールドx,y
    int x;
    int y;

    //3つのコンストラクタを持つ
    //引数なし
    PlacedRectangle() {
        setLocation(0, 0);
    }

    //位置つき
    PlacedRectangle(int x, int y) {
        setLocation(x, y);
    }

    //位置と大きさつき
    PlacedRectangle(int x, int y, int width, int height) {
        super(width, height);
        setLocation(x, y);
    }

    //位置を変更するメゾッドsetLocation
    void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[(" + x + "," + y + ")" + super.toString() + "]";
    }

    public static void main(String[] args) {
        PlacedRectangle a = new PlacedRectangle();
        PlacedRectangle b = new PlacedRectangle(12, 34);
        PlacedRectangle c = new PlacedRectangle(31, 41, 59, 26);
        PlacedRectangle d = new PlacedRectangle(1, 2, 100, 200);
        d.setLocation(3, 4);
        System.out.println("a" + a);
        System.out.println("b" + b);
        System.out.println("c" + c);
        System.out.println("d" + d);
    }

}

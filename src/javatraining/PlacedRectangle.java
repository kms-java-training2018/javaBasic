package javatraining;

public class PlacedRectangle extends Rectangle {

    //int型の変数を宣言
    int x;
    int y;

    //引数なしコンストラクタ
    PlacedRectangle() {
        super();
        setLocation(0, 0);
    }

    //位置付きコンストラクタ
    PlacedRectangle(int x, int y) {
        super();
        setLocation(x, y);
    }

    //位置と大きさ付きコンストラクタ
    PlacedRectangle(int x, int y, int width, int height) {
        super(width, height);
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
        return "[ (" + x + ", " + y + ") " + super.toString() + "]";

    }

    public static void main(String[] args) {
        PlacedRectangle p1 = new PlacedRectangle();
        PlacedRectangle p2 = new PlacedRectangle(12, 34, 123, 45);
        p2.setLocation(56, 78);
        PlacedRectangle p3 = new PlacedRectangle(12, 34);


        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }

}

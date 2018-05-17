package javatrainig;

public class PlaceRectangle {
    //位置を宣言
    int x,y;
    Rectangle r;

    //引数がない場合
    PlaceRectangle() {
        setLocation(0, 0);
        r = new Rectangle();
    }

    //引数が２つ設定されている
    PlaceRectangle(int x, int y) {
        setLocation(x, y);
        r = new Rectangle();
    }

    //引数が４つ設定されている
    PlaceRectangle(int x, int y, int width, int height) {
        r = new Rectangle(width, height);
        setLocation(x, y);
    }

    //クラスのx,y に引数x,y を代入
    void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[ (" + x + ", " + y + ") " + r + "]";
    }

    public static void main(String[] args) {
        PlaceRectangle a = new PlaceRectangle(12, 23, 7, 8);
        System.out.println(a);
    }
}

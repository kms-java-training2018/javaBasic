package javatrainig;

public class PlaceRectangle extends Rectangle {
    //位置を宣言
    int x, y;

    //引数がない場合
    PlaceRectangle() {
        setLocation(0, 0);
    }

    //引数が２つ設定されている
    PlaceRectangle(int x, int y) {
        setLocation(x, y);
    }
    //引数が４つ設定されている
    PlaceRectangle(int x, int y, int width, int height){
        super(width, height);
        setLocation(x, y);
    }

    //代入
    void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[ (" + x + ", " + y + ") " + super.toString() + "]";
    }

    public static void main(String[] args) {
        PlaceRectangle a = new PlaceRectangle(12, 23, 7, 8);
        System.out.println(a);
    }
}

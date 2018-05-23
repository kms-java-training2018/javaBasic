package javatraining;

public class PlaceRectangle extends Rectangle {
    int x;
    int y;

    //コンストラクタ引数なし
    PlaceRectangle() {
        setLocation(0, 0);
    }

    //位置つき
    PlaceRectangle(int x, int y) {
        setLocation(x, y);
    }

    //位置と大きさつき
    PlaceRectangle(int x, int y, int width, int height) {
        super(width, height);
        setLocation(x, y);
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;

    }

    @Override
    public String toString() {
        return "[" + "(" + x + "," + y + ")" + "," + "[" + width + "," + height + "]" + "]";
    }

    public static void main(String[] args) {
        //                                        x, y   width height
        PlaceRectangle aa = new PlaceRectangle(123, 45, 56, 789);
        System.out.println(aa.toString());

    }

}

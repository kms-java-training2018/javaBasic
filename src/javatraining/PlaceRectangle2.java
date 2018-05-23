package javatraining;

public class PlaceRectangle2 {
    int x;
    int y;
    Rectangle re;

    PlaceRectangle2() {
        setLocation(0, 0);
    }

    PlaceRectangle2(int x, int y) {

        setLocation(x, y);
    }

    PlaceRectangle2(int x, int y, int width, int height) {
        re = new Rectangle();
        setLocation(x, y);
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[" + "(" + x + "," + y + ")" + "," + "[" + re.width + "," + re.height + "]" + "]";
    }
    public static void main(String[] args) {
        PlaceRectangle2 bb = new PlaceRectangle2(123, 45, 67, 89);
        System.out.println(bb.toString());

    }

}

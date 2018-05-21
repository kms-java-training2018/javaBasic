package javatraining;
//12章 12-4

public class PlacedRectangle extends Rectangle {
    // フィールド
    int x;
    int y;

    // コンストラクタ
    PlacedRectangle() {
        setLocation(0,0);
    }


    PlacedRectangle(int x, int y) {
        setLocation(x, y);
    }


    PlacedRectangle(int x,int y,int width,int height) {
        super(width,height);
        setLocation(x,y);
    }

    //メソッドの宣言
    void setLocation(int x,int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[("+ x + "," + y +")"+ super.toString() + "]";
    }



//
// public static void main(String[] args) {
//
//     PlacedRectangle r1 =new PlacedRectangle(1,2,3,4);
//     System.out.println(r1);
//     }
//
}

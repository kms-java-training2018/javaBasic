package javatraining;


/*
 * 花輪朋典
 *
 * 問題12-5
 * 問題12-4のPlaceRectangleを、Rectangleのサブクラスとしてではなく、
 * Rectangle型のインスタンス変数を持つクラスとして宣言してください。
 *
 *
 */



public class PlacedRectangle extends Rectangle {
    // フィールドの宣言
    int x;
    int y;

    // コンストラクタ
    // 引数なし
    PlacedRectangle(){
        setLocation(0, 0, 0, 0);
    }
    // 位置付き
    PlacedRectangle(int x, int y){
        setLocation(x, y, 0, 0);
    }
    // 位置と大きさ付き
    PlacedRectangle(int x, int y, int width, int height){
        setLocation(x, y, width, height);
    }
    // 位置を変更するメソッド
    public void setLocation(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    // 文字列表現を返すメソッド
    final public String setString() {
        return "[ (" + x + ", " + y + ") [" + width + ", " + height + "]]";
    }
}

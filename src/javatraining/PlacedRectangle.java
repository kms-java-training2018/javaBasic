package javatraining;


/*
 * 花輪朋典
 *
 * -------------------------------------------------------------------------------
 * 問題12-5
 * 問題12-4のPlacedRectangleを、Rectangleのサブクラスとしてではなく
 * Rectangle型のインスタンス変数を持つクラスとして宣言してください。
 * -------------------------------------------------------------------------------
 *
 * 12-4と比べ大きな変更はありませんが、Rectangle型の変数rectangleを宣言し
 * Rectangleクラスで入力された変数widthと変数heightを呼びだしました。
 *
 */



public class PlacedRectangle{
    // フィールドの宣言
    Rectangle rectangle;
    int x;
    int y;

    // コンストラクタ
    // 引数なし
    PlacedRectangle(){
        rectangle = new Rectangle();
        setLocation(0, 0);
    }
    // 位置付き
    PlacedRectangle(int x, int y){
        rectangle = new Rectangle();
        setLocation(x, y);
    }
    // 位置と大きさ付き
    PlacedRectangle(int x, int y, int width, int height){
        rectangle = new Rectangle(width, height);
        setLocation(x, y);
    }
    // 位置を変更するメソッド
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;

    }
    // 文字列表現を返すメソッド
    @Override
    public String toString() {
        return "[ (" + x + ", " + y + ") " + rectangle +" ]";
    }
}

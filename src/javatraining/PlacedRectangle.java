package javatraining;


/*
 * 花輪朋典
 * 問題12-4
 * 次の機能を持つPlacedRectangleを、Rectangleのサブクラスとして宣言してください。
 *   ・位置を表すint型のフィールドx, yを持つ
 *   ・3つのコンストラクタを持つ
 *     （１）引数なし
 *     （２）位置付き
 *     （３）位置と大きさ付き
 *   ・位置を変更するメソッドsetLocationを持つ
 *   ・標準的な文字列表現を返すメソッドtoStringを持つ
 */



public class PlacedRectangle extends Rectangle {
    int x;
    int y;

    PlacedRectangle(){
        setLocation(0, 0, 0, 0);
    }

    PlacedRectangle(int x, int y){
        setLocation(x, y, 0, 0);
    }

    PlacedRectangle(int x, int y, int width, int height){
        setLocation(x, y, width, height);
    }

    public void setLocation(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    final public String setString() {
        return "[ (" + x + ", " + y + ") [" + width + ", " + height + "]]";
    }
}

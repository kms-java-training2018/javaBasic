package javatraining;


/*
 * 花輪朋典
 *
 * -------------------------------------------------------------------------------
 * 問題12-4
 * 次の機能を持つPlacedRectangleを、Rectangleのサブクラスとして宣言してください。
 *
 *   ・位置を表すint型のフィールドx, yを持つ
 *   ・3つのコンストラクタを持つ
 *       (1)引数なし
 *       (2)位置付き
 *       (3)位置と大きさ付き
 *   ・位置を変更するメソッドsetLocationを持つ
 *   ・標準的な文字列表現を返すメソッドtoStringを持つ
 * -------------------------------------------------------------------------------
 *
 *
 * 回答を読みながら、全体的な修正をしました。
 *  ・superの追加
 *  ・コメントの追加
 *  ・Overrideの追加
 *  ・return文の変更
 *  ・引数の変更
 *
 */



public class PlacedRectangle extends Rectangle {
    // フィールドの宣言
    int x;
    int y;

    // コンストラクタ
    // 引数なし
    PlacedRectangle(){
        setLocation(0, 0);
    }
    // 位置付き
    PlacedRectangle(int x, int y){
        setLocation(x, y);
    }
    // 位置と大きさ付き
    PlacedRectangle(int x, int y, int width, int height){
        super(width, height);
        setLocation(x, y);
    }
    // 位置を変更するメソッド
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;

    }
    // 文字列表現を返すメソッド
    // @Overrideの追記、setStringから、toStringへ変更
    @Override
    public String toString() {
        return "[ (" + x + ", " + y + ") " + super.toString()+" ]";
    }
}

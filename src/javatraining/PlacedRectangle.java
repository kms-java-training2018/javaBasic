package javatraining;

public class PlacedRectangle extends Rectangle{
    //-------------------------------------------------------------------
    // フィールド
    //-------------------------------------------------------------------
    // x座標
    int x;
    // y座標
    int y;
    //-------------------------------------------------------------------
    // コンストラクタ
    //-------------------------------------------------------------------
    public PlacedRectangle() {
        // 変更なし
        super();
        setLocation(0,0);
    }

    public PlacedRectangle(int x,int y) {
        // 位置のみ変更
        super();
        setLocation(x,y);
    }
    public PlacedRectangle(int x,int y,int w,int h) {
        // 全部変更
        super(w,h);
        setLocation(x,y);
    }

    //-------------------------------------------------------------------
    // メソッド
    //-------------------------------------------------------------------
    // 位置を変更するメソッド
    public void setLocation(int x, int y) {
        // 位置を変更する
        this.x = x;
        this.y = y;
    }
    // サイズを表示するプログラム
    public String toString() {
        // 数値を返す
        // こちらのほうをtoStringで出来ることを忘れてました
        return "[(" + x + ", " + y + ")" + super.toString() +"]";
    }

    // メインメソッド
     public static void main(String[] args) {
         // インスタンス作成 位置を送ることも出来る
         Rectangle pla = new PlacedRectangle();
         PlacedRectangle pla2 = new PlacedRectangle();
         // 表示する
         System.out.println(pla);
         System.out.println(pla2);
     }
}

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
        // 何も変更しない
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
        return "[ (" + x + ", " + y + ") [" + width + ", " + height + "] ]";
    }

    // メインメソッド
     public static void main(String[] args) {
         // 作成
         Rectangle rect = new PlacedRectangle(1,1);

         // 表示する
         System.out.println(rect.toString());
     }
}

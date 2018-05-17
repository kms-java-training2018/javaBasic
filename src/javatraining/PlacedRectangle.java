package javatraining;

public class PlacedRectangle{
    //-------------------------------------------------------------------
    // フィールド
    //-------------------------------------------------------------------
    // x座標
    int x;
    // y座標
    int y;
    // Rectangleクラス設定
    public static Rectangle rect = new Rectangle(1,1);
    //-------------------------------------------------------------------
    // コンストラクタ
    //-------------------------------------------------------------------
    public PlacedRectangle() {
        // 何も変更しない
        setLocation(0,0);
        rect.setSize(0, 0);
    }

    public PlacedRectangle(int x,int y) {
        // 位置のみ変更
        setLocation(x,y);
        rect.setSize(0, 0);
    }
    public PlacedRectangle(int x,int y,int w,int h) {
        // 全部変更
        setLocation(x,y);
        rect.setSize(w, h);
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
    	// こちらのほうをオーバーロードのものを使いました
        return "[ (" + x + ", " + y + ")" + rect +"]";
    }

    // メインメソッド
     public static void main(String[] args) {
    	 PlacedRectangle pla = new PlacedRectangle(1,1);
         // 表示する
         System.out.println(pla);
     }
}

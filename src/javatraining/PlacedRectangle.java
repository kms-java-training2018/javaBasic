package javatraining;
//--------------------------------------------------------
// 問題12-5用に変更しました。
//--------------------------------------------------------
public class PlacedRectangle{

    //--------------------------------------------------------
    // フィールド
    //--------------------------------------------------------
    // フィールドの宣言
    Rectangle r;
	int x;
    int y;

    //--------------------------------------------------------
    // コンストラクタ
    //--------------------------------------------------------
    // 引数なしコンストラクタ
    PlacedRectangle() {
    	this(1,1);
        r = new Rectangle();
    }

    // 位置付きコンストラクタ
    PlacedRectangle(int x, int y) {
    	r = new Rectangle();
    	setLocation(x, y);
    }

    // 位置と大きさ付きコンストラクタ
    PlacedRectangle(int x, int y, int width, int height) {
    	r = new Rectangle(width, height);
        setLocation(x, y);
    }

    //--------------------------------------------------------
    // メソッド
    //--------------------------------------------------------
    // x位置とy位置を設定するsetSizeメソッド
    void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // x位置、y位置、幅と高さを出力するtoStringメソッド
    @Override
    public String toString() {
        return "[ (" + x + "," +  y + ") " + r + " ]";
    }

    // メインメソッド
    public static void main(String[] args) {

        // インスタンスを宣言
        PlacedRectangle r1 = new PlacedRectangle();
        PlacedRectangle r2 = new PlacedRectangle(1,2);
        PlacedRectangle r3 = new PlacedRectangle(1,2,3,4);

        // 結果を出力
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
    }

}

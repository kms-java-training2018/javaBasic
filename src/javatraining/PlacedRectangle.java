package javatraining;
/**
 * 【教科書p75　問題12-5】
 * サブクラスを宣言する問題（IS-A関係）
 * ↓
 * サブクラスとしてではなく、Rectangle型の変数を持つクラスとして宣言（HAS-A関係）
 * @author iyo-marina
 *
 */
public class PlacedRectangle {
//====宣言==============================================================================================================
//----フィールド--------------------------------------------------------------------------------------------------------
    // 	位置を表すint型変数x,yを宣言
    int x;
    int y;
    Rectangle a;

//----コンストラクタ----------------------------------------------------------------------------------------------------
    // ①引数なし
    public PlacedRectangle() {
        setLocation(0, 0);
    }

    // ②位置つき
    public PlacedRectangle(int x, int y) {
        setLocation(x, y);
    }

    // ③位置と大きさつき
    public PlacedRectangle(int x, int y, int w, int h) {
        setLocation(x, y);
        a = new Rectangle();
        a.setSize(w, h);
    }


//----メソッド----------------------------------------------------------------------------------------------------------
    // 位置を変更するメソッド
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 標準的な文字列表現
    @Override
    public String toString() {
        return "[" + "(" + x + "," + y + ")" + "[" + a.width + ", " + a.height + "]" + "]";
    }

//====メインメソッド====================================================================================================
    public static void main(String[] args) {

        PlacedRectangle r = new PlacedRectangle(1,2,3,4);
        // r.setSize(10, 20);
//        System.out.println("面積は" + r.width + "です。");
        System.out.println(r);

    }

}
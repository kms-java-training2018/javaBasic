package javatraining;

public class Rectangle {
    //-------------------------------------
    // 変数設定(フィールド)
    //-------------------------------------
    // 幅
    int width;
    // 高さ
    int height;
    // 左隅の位置の横
    int x;
    // 左隅の位置の縦
    int y;
    // 指定が無いときの幅と高さ
    final int INITIAL_WIDTH = 10;
    final int INITIAL_HEIGHT = 20;
    //-------------------------------------
    // コンストラクタ
    //-------------------------------------
    Rectangle(){
        // サイズを設定する
        setSize(INITIAL_WIDTH,INITIAL_HEIGHT);
        // 座標を設定
        setPoint(0,0);
    }
    //-------------------------------------
    // コンストラクタ
    //-------------------------------------
    Rectangle(int w,int h) {
        // サイズを設定する
        setSize(w,h);
        // 座標を設定
        setPoint(0,0);
    }
    //-------------------------------------
    // コンストラクタ
    //-------------------------------------
    Rectangle(int w,int h,int x,int y) {
        // サイズを設定する
        setSize(w,h);
        // 座標を設定
        setPoint(x,y);
    }
    //-------------------------------------
    // サイズを設定する
    //-------------------------------------
    void setSize(int w,int h) {
        // 幅
        width = w;
        // 高さ
        height = h;
    }
    //-------------------------------------
    // 位置を設定する
    //-------------------------------------
    void setPoint(int xx,int yy) {
        // 横
        x = xx;
        // 縦
        y = yy;
    }
    //-------------------------------------
    // 文字列で表示
    //-------------------------------------
    public String toString() {
        // 表示
        return "[" + width +", " + height +", " + x +", " + y + "]";
    }

    //-------------------------------------
    // 重なり部分を計算
    //-------------------------------------
    String intersect(Rectangle r) {
        // 左のxの座標
        int sx = Math.max(this.x, r.x);
        // 左のyの座標
        int sy = Math.max(this.y, r.y);
        // 横の長さの小さいほう
        int ex = Math.min(this.x + this.width - sx,r.x + r.width - sx);
        // 縦の長さの小さいほう
        int ey = Math.min(this.y + this.height - sy ,r.y + r.height - sy);

        // 数値が両方ともプラスのときのみ入れる
        if (ex > 0 && ey > 0){
            return "[" + ex + ", " + ey + ", " + sx + ", " + sy + "]";
        }

        // 返す値
        return null;

    }

    //-------------------------------------
    // 面積を計算する
    //-------------------------------------
    int getArea() {
        // 面積を返す
        return width * height;
    }
    //-------------------------------------
    // メインメソッド
    //-------------------------------------
    public static void main(String[] args) {
        // 引数なしインスタンス
        Rectangle r1 = new Rectangle();
        // 引数ありインスタンス
        Rectangle r2 = new Rectangle(10, 20, 5, 15);
        // 何が表示されているか
        System.out.println("[幅,長さ,X座標,Y座標]");
        // 座標表示
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        // 重なり部分表示
        System.out.println(r1.intersect(r2));

    }
}

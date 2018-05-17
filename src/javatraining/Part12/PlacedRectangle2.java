package javatraining.Part12;

public class PlacedRectangle2 {
    //	変数定義
    int x; // x座標
    int y; // y座標

    Rectangle re = new Rectangle();

    //	コンストラクタ
    PlacedRectangle2() {
        setLocation(12, 34);
        re.setSize(123, 45);
    }

    /**
     *	コンストラクタ(位置付き)
     * @param x	x座標
     * @param y	y座標
     */
    PlacedRectangle2(int x, int y) {
        setLocation(x, y);
        re.setSize(123, 45);
    }

    /**
     *	コンストラクタ(位置と大きさ付き)
     * @param x	x座標
     * @param y	y座標
     * @param width	幅
     * @param height	高さ
     */
    PlacedRectangle2(int x, int y, int width, int height) {
        setLocation(x, y);
        re.width = width;
        re.height = height;
    }

    /**
     *	位置設定
     * @param x	x座標
     * @param y	y座標
     */
    void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //	文字列を返すメソッド
    @Override
    public String toString() {
        return "[(" + x + "," + y + ")" + super.toString();
    }

    /**
     * メインメソッド
     * @param args
     */
    public static void main(String[] args) {
        // インスタンス作成
        PlacedRectangle pr = new PlacedRectangle(12, 34, 123, 45);
        // 結果出力
        System.out.println(pr.toString());
    }
}

package javatraining;

public class Rectangle {
    //--------------------------------------------------------
    // フィールド
    //--------------------------------------------------------
    // フィールドの宣言
    int width;
    int height;

    //--------------------------------------------------------
    // コンストラクタ
    //--------------------------------------------------------
    // 引数なしコンストラクタ
    Rectangle() {
        setSize(0, 0);
    }

    // 大きさ付きコンストラクタ
    Rectangle(int width, int height) {
        setSize(width, height);
    }

    //--------------------------------------------------------
    // メソッド
    //--------------------------------------------------------
    // 幅と高さを設定するsetSizeメソッド
    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // 幅と高さを出力するtoStringメソッド
    @Override
    public String toString() {
        return "[" + width + "," + height + "]";
    }
}

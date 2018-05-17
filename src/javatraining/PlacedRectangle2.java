package javatraining;

/**
 * 教科書　下　第12章課題
 * 12-5
 * PlaceRectangleをRectangle型のインスタンス変数を持つクラスとして宣言
 * */
public class PlacedRectangle2 {
	/*
	 * クラス間の関係性が無いため、
	 * フィールドの設定として、Rectangle型の変数rを設定。
	 * */
	int x;
	int y;
	Rectangle r;

	/*
	 * 引数無し
	 * 空のRectangle（width,height）を呼び出す
	 * 位置を0,0に設定
	 */
	PlacedRectangle2() {
		r = new Rectangle();
		setLocation(0, 0);
	}

	/*
	 * 位置付き
	 * 空のRectangle（width,height）を呼び出す
	 * 位置は入力されたものを利用
	 * */
	PlacedRectangle2(int x, int y) {
		r = new Rectangle();
		setLocation(x, y);
	}

	/*
	 * 位置と大きさ付き
	 * Rectangleにwidth,heightの値を入れたものを呼び出す
	 * 位置は入力されたものを利用
	 * */
	PlacedRectangle2(int x, int y, int width, int height) {
		r = new Rectangle(width, height);
		this.x = x;
		this.y = y;
	}

	/*
	 * 位置を変更するメソッド
	 * 入力値を位置に設定
	 * */
	void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/*
	 * 標準的な文字列表現を返すメソッド
	 * RectangleのtoString()に位置を加えたものを文字列表現として設定。
	 * */
	public String toString() {
		return "[(" + x + ", " + y + ") " + r.toString() + "]";
	}

	public static void main(String[] args) {
		PlacedRectangle pr = new PlacedRectangle(12, 34, 1234, 5678); //表示テスト(x=12,y=34,width=1234,height=5678)
		System.out.println(pr.toString());
	}

}

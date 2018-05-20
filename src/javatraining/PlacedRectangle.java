package javatraining;

/**
 * 教科書　下　第12章課題
 * 12-4
 * PlaceRectangleをRectangleのサブクラスとして宣言する。
 * */
public class PlacedRectangle extends Rectangle {

	int x;
	int y;

	/*
	 * 引数無し
	 * 位置を0,0に設定
	 */
	PlacedRectangle() {
		setLocation(0, 0);
	}

	/*
	 * 位置付き
	 * 入力された位置でsetLocationのメソッドを利用
	 * */
	PlacedRectangle(int x, int y) {
		setLocation(x, y);
	}

	/*
	 * 位置と大きさ付き
	 * Rectangleにwidth,heightの値を入れたものを呼び出す
	 * 位置は入力されたものを利用
	 * */
	PlacedRectangle(int x, int y, int width, int height) {
		super(width, height);
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
		return "[(" + x + ", " + y + ") " + super.toString() + "]";
	}

	public static void main(String[] args) {
		PlacedRectangle pr = new PlacedRectangle(12, 34, 1234, 5678); //表示テスト(x=12,y=34,width=1234,height=5678)
		System.out.println(pr.toString());
	}
}

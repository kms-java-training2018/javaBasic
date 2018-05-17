package javatraning;


public class PlacedRectangle2{

	Rectangle r;

	int x;
	int y;

	//コンストラクタ
	//引数なし
	PlacedRectangle2 (){
		x = 0;
		y = 0;
		r = new Rectangle();
	}

	//引数位置付き
	PlacedRectangle2 (int x,int y){
		setLocation(x,y);
	}

	//引数位置、大きさ付き
	PlacedRectangle2 (int x,int y,int width,int height){
		r = new Rectangle(width, height);
		setLocation(x,y);
	}

	//位置を変更するメソッド
	public void setLocation(int a,int b) {
		x = a;
		y = b;
	}

	//標準的な文字列を返すメソッド
	public String toString() {
		return "("+ x + ","+ y +")"+ r.toString();
	}

	// 確認用メインメソッド
	 public static void main(String[] args) {
		PlacedRectangle2 pr = new PlacedRectangle2(12,34,123,45);
		String a = pr.toString();

		System.out.println(a);
	}
}



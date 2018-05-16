package javatraining;

public class Circle {
	// フィールドを設定
	int radius;
	int pi;
	// 引数なしコンストラクタは半径を10に設定
	Circle() {
		setSize(10,3);
	}
	// 引数ありコンストラクタは引数を半径に設定
	Circle(int r, int p) {
		setSize(r,p);
	}
	void setSize(int r, int p) {
		radius = r;
		pi = p;
	}
	// 円周を計算
	int getCirconference() {
		return 2 * radius * pi;
	}
	// 円の面積を計算
	int getArea() {
		return radius * radius * pi;
	}
}
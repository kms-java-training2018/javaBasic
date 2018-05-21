package javatraning;

public class Circle {
	//暮らすフィールドの宣言
	static double pi = Math.PI; //円周率
	int radius;

	//半径10の円の設定
	static int autoRadius = 10;
	static double autoArea = autoRadius * autoRadius * pi;
	static double autoFerence = 2 * autoRadius * pi;


	//コンストラクタ

	 Circle() {
		radius = 10;

	}
	Circle(int x) {
		radius = x;

	}

	//面積の計算
	double getArea() {
		double area = radius * radius * pi;
		return autoArea + area;

	}
	//円周の計算
	double getFerence() {
		double ference = 2 * radius * pi;
		return ference + autoFerence;
	}

}

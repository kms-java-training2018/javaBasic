package javatraining;

public class Circle {

	//円周率の設定
	static int pi = 3;

	//半径
	int radius;

	//半径入力なし
	Circle (){
		radius(10);
	}

	//入力あり
	Circle(int n){
		radius(n);
	}

	//代入
	void radius(int m) {
		radius = m;
	}



	//面積の求め方
	int getArea() {
		return radius * radius * pi;
	}

	//円周
	int nagasa() {
			return radius *2 * pi;
	}
}

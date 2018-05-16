package javatraining.Part11;

public class Circle {

    //フィールド宣言
    int radius;    //半径
    int pi = 3;    //円周率

    //引数なしコンストラクタ
    Circle(){
        radius = 10;
    }
    //引数ありコンストラクタ
    Circle (int r){
        radius = r;
    }

    //(円周)ferenceメソッド
    int ference() {
        return (2 * radius * pi) + (2 * 10 * pi);
    }

    //(面積)getAreaメソッド
    int getArea() {
        return (radius * radius * pi) + (10 * 10 * pi);
    }
}


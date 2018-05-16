package javaBasic;
/**
 * 5/16 課題
 * 2つの円の円周、面積を合算する処理
 * フィールド、コンストラクタ、メソッドを設定するクラス
 */
public class Circle {
    //半径と円周率のフィールドを設定、円周率は初期値を3に設定
    int radius;
    int pi = 3;

    //引数つきコンストラクタ設定
    Circle(int r){
        radius = r;
    }
    //引数なしのコンストラクタ設定
    Circle(){
        radius = 10;
    }
    //円周を出す用のメソッドをつくる
    int getCircumference() {
        return radius * 2 * pi;
    }
    //面積を出す用のメソッドをつくる
    int getArea() {
        return radius * radius * pi;
    }
}

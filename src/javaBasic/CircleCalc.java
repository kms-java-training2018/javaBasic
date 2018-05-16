package javaBasic;
/**
 * 5/16 課題
 * 2つの円の円周、面積を合算する処理
 * インスタンスを作り、計算結果を表示するクラス
 */
public class CircleCalc {
    public static void main(String[] args) {

        //一つ目の円(半径5)のインスタンスを作る
        Circle circle1 = new Circle(5);
        //一つ目の円の円周と面積を格納する変数をそれぞれ宣言、代入する
        int circumference1 = circle1.getCircumference();
        int area1 = circle1.getArea();

        //二つ目の円(半径はデフォルト)のインスタンスを作る
        Circle circle2 = new Circle();
        //二つ目の円の円周と面積を格納する変数をそれぞれ宣言、代入する
        int circumference2 = circle2.getCircumference();
        int area2 = circle2.getArea();

        //結果を出力する
        System.out.println("2つの円の面積の和は "+ (area1 + area2) + " です。" );
        System.out.println("2つの円の円周の和は "+ (circumference1 + circumference2) + " です。" );
    }
}

package javatraining;

public class CircleCalc {

    public static void main(String[] args) {
        //new Circleを作る
        Circle c1 = new Circle();
        Circle c2 = new Circle(10);
        //円の面積の合計を出力
        System.out.println("二つの円の面積の合計は" + (c1.getArea() + c2.getArea()) + "です。");
        //円周の合計を出力
        System.out.println("二つの円周の合計は" + (c1.getRound() + c2.getRound()) + "です。");
    }

}

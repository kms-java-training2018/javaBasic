package javatraining;

public class CircleCalc {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Circle c1 = new Circle();
        Circle c2 = new Circle(10);
        System.out.println("二つの円の面積の合計は" + (c1.getArea() + c2.getArea()) + "です。");
        System.out.println("二つの円周の合計は" + (c1.getRound() + c2.getRound()) + "です。");
    }

}

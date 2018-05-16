package javatraining;

public class CircleCalc {

    public static void main(String[] args) {
        // 2つの円のインスタンスを作成

        double user = Double.parseDouble(args[0]);
        Circle c1 = new Circle();			// 半径10(初期値)
        Circle c2 = new Circle(user);		// ユーザー指定の半径


        // 2つの円の面積の和
        System.out.println("2つの円の面積の和は" + ( c1.getArea() + c2.getArea() ) + "です。");

        // 2つの円の円周の和
        System.out.println("2つの円の円周の和は" + ( c1.getCircumference() + c2.getCircumference() ) + "です。");

    }

}

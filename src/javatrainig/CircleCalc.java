package javatrainig;

public class CircleCalc {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        //
        Circle m = new Circle();

        Circle o = new Circle(3);

        //mの円周の長さと面積を出力
        System.out.println(m.getCircumferense());
        System.out.println(m.getArea());

        //oの円周の長さと面積を出力
        System.out.println(o.getCircumferense());
        System.out.println(o.getArea());

        //２つの和
        System.out.println(m.getCircumferense() + o.getCircumferense());
        System.out.println(m.getArea() + o.getArea());

    }

}

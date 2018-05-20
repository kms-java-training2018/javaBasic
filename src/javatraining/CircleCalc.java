package javatraining;

public class CircleCalc {

    public static void main(String[] args) {
        double area_sum;
        double circumference_sum;

        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle();

        // 面積の和を計算
        area_sum = circle1.getArea() + circle2.getArea();

        // 円周の和を計算
        circumference_sum = circle1.getCircumFerence() + circle2.getCircumFerence();

        // 面積の和を表示
        System.out.println("面積の和は、 " + area_sum + " で、");

        // 円周の和を表示
        System.out.println("円周の和は、 " + circumference_sum + "です。");


    }

}

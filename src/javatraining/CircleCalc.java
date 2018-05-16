package javatraining;

public class CircleCalc {

public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ

    //C1の面積と円周表示
    Circle c1 = new Circle();
    System.out.println("C1の円の面積は" + c1.getArea());
    System.out.println("円周は" + c1.getCircumference());

    System.out.println("");

    //C2の円周と面積表示
    Circle c2 = new Circle(40);
    System.out.println("C2の円の面積は" + c2.getArea());
    System.out.println("円周は" + c2.getCircumference());

    System.out.println("");

    //合計
    System.out.println("2つの円の合計面積は" + (c1.getArea()+c2.getArea()));
    System.out.println("2つの円の合計円周は" + (c1.getCircumference()+c2.getCircumference()));
}

}

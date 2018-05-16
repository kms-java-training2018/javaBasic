package javatraining.Part11;

public class CircleCalc {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int sumCircleArea = 0; // 面積の合計
        int sumCircleCircumference = 0; // 円周の合計

        // インスタンス生成(引数あり)
        Circle circle1 = new Circle(5);

        // インスタンス生成(引数なし)
        Circle circle2 = new Circle();

        // 円周の合計計算
        sumCircleCircumference = (int) circle1.getCircumference() + (int) circle2.getCircumference();

        // 面積の合計計算
        sumCircleArea = (int) circle1.getArea() + (int) circle2.getArea();

        // 結果の出力
        System.out.println("円周の和" + sumCircleCircumference);
        System.out.println("面積の和" + sumCircleArea);
    }

}

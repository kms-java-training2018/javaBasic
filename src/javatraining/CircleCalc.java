package javatraining;

/**
 * Circleクラスから円の半径を呼び出し、
 * 個々の円（自分で入力された半径の円と半径10の円）の
 * 半径と面積、円周を表示。
 * その後、2つの円の面積、円周の和を表示させる。
 * */
public class CircleCalc {

    public static void main(String[] args) {
        /*
         * 面積、円周の合計を入れる変数の設定。
         * */
        double sumArea = 0;
        double sumCircumference = 0;
        /*
         * それぞれの円の情報を呼び出して表示
         * c1 = 入力された値（引数有り）での円、c2 =半径10（引数無し）での円
         * */
        System.out.println("半径を入力してください。");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        try {
            int myRadius = sc.nextInt();
            Circle c1 = new Circle(myRadius);
            System.out.println("入力された円の半径 = " + c1.radius);
            System.out.println("入力された円の面積 = " + c1.getArea());
            System.out.println("入力された円の円周 = " + c1.getCircumference());
            Circle c2 = new Circle();
            System.out.println("半径10の円の半径 = " + c2.radius);
            System.out.println("半径10の円の面積 = " + c2.getArea());
            System.out.println("半径10の円の円周 = " + c2.getCircumference());
            /*
             * 改行後、それぞれの合計値を求めて表示
             * */
            System.out.println("");
            sumArea = c1.getArea() + c2.getArea();
            sumCircumference = c1.getCircumference() + c2.getCircumference();
            System.out.println("面積の合計 = " + sumArea);
            System.out.println("円周の合計 = " + sumCircumference);
        } catch (Exception e) {
            System.out.println("error");
        }
        sc.close();
    }

}

package javatraining;

public class Circleclac {

    public static void main(String[] args) {
        //1つめの円について
        Circle circleclac = new Circle();

        //面積
        int sumgetArea = circleclac.getArea();
        System.out.println("円1面積" + sumgetArea);

        //円周
        int ensyuu = circleclac.ensyuu();
        System.out.println("円1円周" + ensyuu);

        //2つめの円について

        Circle circleclac2 = new Circle(10, 3);

        //面積
        int sumgetArea2 = circleclac2.getArea();
        System.out.println("円2面積" + sumgetArea2);

        //円周
        int ensyuu2 = circleclac2.ensyuu();
        System.out.println("円2円周" + ensyuu2);

        //合計
        int sumgetArea3 = circleclac.getArea() + circleclac2.getArea();
        System.out.println("合計面積" + sumgetArea3);
        //合計
        int ensyuu3 = circleclac.ensyuu() + circleclac2.ensyuu();
        System.out.println("合計円周" + ensyuu3);

    }

}

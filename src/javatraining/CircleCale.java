package javatraining;

public class CircleCale {

	public static void main(String[] args) {
		int sumArea;
		int sumNagasa;

		Circle circle1 = new Circle(5);
		Circle circle2 =new Circle();

		sumArea =circle1.getArea()+circle2.getArea();
		sumNagasa = circle1.nagasa()+circle2.nagasa();


		System.out.println("面積の和は"+sumArea+"です。");
		System.out.println("円周の和は"+sumNagasa+"です。");


	}
}

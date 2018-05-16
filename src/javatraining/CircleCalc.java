package javatraining;

public class CircleCalc {
	public static void main(String[] args) {
		
		
		Circle c1 = new Circle();
		
		
		int i = Integer.parseInt(args[0]);
		Circle c2 = new Circle(i,3);
		
		
		
		
		// 円周の和
		System.out.println(c1.getCirconference() + c2.getCirconference());
		c1.getCirconference();
		c2.getCirconference();
		
		
		
		
		
		
		// 面積の和
		System.out.println(c1.getArea() + c2.getArea());
		c1.getArea();
		c2.getArea();
	}

}

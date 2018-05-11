package javatraining;

public class For6_4 {

	public static void main(String[] args) {
		// 146p 6-4
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + (i*j) + ", ");
				if (i * j < 10) {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}

}

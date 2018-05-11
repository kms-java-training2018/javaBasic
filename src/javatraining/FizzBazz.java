package javatraining;

public class FizzBazz {

	public static void main(String[] args) {
		// 3n Fizz 5n Bazz 3*5n FizzBazz
		final int LAST_NUM = 100;
		final int FIZZ = 3;
		final int BAZZ = 5;
		for (int i = 1; i <= LAST_NUM; i++) {
			if ((i % FIZZ) == 0 && (i % BAZZ) == 0) {
				System.out.println("FizzBazz");
			} else if ((i % FIZZ) == 0) {
				System.out.println("Fizz");
			} else if ((i % BAZZ) == 0) {
				System.out.println("Bazz");
			} else {
				System.out.println(i);
			}
		}

	}

}

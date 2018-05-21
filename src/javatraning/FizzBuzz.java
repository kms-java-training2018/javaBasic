package javatraning;

public class FizzBuzz {

	public static void main(String[] args) {
		//

		//1から100までを出力するfor文
		for(int i = 1;i <= 100;i++) {

			//もし15の倍数ならFizzBuzzを表示
			if (i % 15 == 0) {
				System.out.println("FizzBuzz");
			//もし5の倍数ならFizzを表示
			}else if (i % 5 == 0) {
				System.out.println("Buzz");
			//もし3の倍数ならFizzを表示
			}else if (i % 3 == 0) {
				System.out.println("Fizz");
			}else
				System.out.println(i);

		}


	}

}

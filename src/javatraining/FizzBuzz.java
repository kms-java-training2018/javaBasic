package javatraining;

public class FizzBuzz {

	public static void main(String[] args) {
		// 変数宣言
		int i = 1;
		// FizzBuzz判定while文開始
		while (i < 101) {
			// 3の倍数かつ5の倍数か判定
			if ( i % 3 == 0 && i % 5 == 0 ) {
        		System.out.println("FizzBuzz");
        	// 3の倍数か判定
			} else if (i % 3 == 0) {
        		System.out.println("Fizz");
        	// 5の倍数か判定
			} else if (i % 5 == 0) {
        		System.out.println("Buzz");
        	// それ以外の場合
			} else {
        		System.out.println(i);
			}
        i++;
        }
		// FizzBuzz判定while文ここまで
	}
}

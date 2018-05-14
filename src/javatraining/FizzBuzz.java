package javatraining;

/**
 *
 * ★問題文
 * 1~100までの数字(整数)を順に出力してください。
 * ただし、3の倍数の場合は数字の代わりに"Fizz"、
 * 5の倍数の場合は数字の代わりに"Buzz"、
 * 3の倍数であり5の倍数でもある場合は数字の代わりに"FizzBuzz"と出力する。
 *
 * @author iyo-marina
 *
 */

public class FizzBuzz {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        for (int i = 1; i <101; i++) {			// 繰り返しで変数iに1～100の数字を初期化
            if (i % 3 == 0 && i % 5 == 0) {		// 3の倍数かつ5の倍数のとき
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {			// 3の倍数のとき
                System.out.println("Fizz");
            } else if (i % 5 == 0) {			// 5の倍数のとき
                System.out.println("Buzz");
            } else {							// それ以外
                System.out.println(i);
            }

        }
    }

}

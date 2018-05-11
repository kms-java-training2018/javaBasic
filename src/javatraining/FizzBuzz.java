package javatraining;

public class FizzBuzz {
//--------------------------------------------------------------------------
//    1~100までの数字(整数)を順に出力してください。
//    ただし、3の倍数の場合は数字の代わりに"Fizz"、
//    5の倍数の場合は数字の代わりに"Buzz"、
//    3の倍数であり5の倍数でもある場合は数字の代わりに"FizzBuzz"と出力する。
//-----------------------------------------------------------------------------

    public static void main(String[] args) {
        //百まで繰り返す
        for (int i = 1;i<100;i++) {
            if (i % 15 == 0) {
                // 3の倍数かつ5の倍数なのでFizzBuzzと表記
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0) {
                // 3の倍数なのでFizzと表記
                System.out.println("Fizz");
            }
            else if(i % 5 == 0) {
                // 3の倍数なのでBuzzと表記
                System.out.println("Buzz");
            }
            else {
                // 3の倍数なので数値を表記
                System.out.println(i);
            }
        }
    }

}

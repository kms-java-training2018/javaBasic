package javatraining;

public class FizzBuzz {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        for (int i = 1; i <= 100; i++) {

                //iが３の倍数かつ５の倍数の場合→"FizzBuzz"
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");

                //iが３の倍数の場合→"Fizz"
            } else if(i % 3 == 0) {
                System.out.println("Fizz");

                //iが５の倍数の場合→"Buzz"
            } else if(i % 5 == 0) {
                System.out.println("Buzz");

                //iが上記の条件以外の場合→数字
            } else {
                System.out.println(i);
            }

        }
    }

}

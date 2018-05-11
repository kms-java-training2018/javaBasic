package javatraining;

public class FizzBuzz {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        //100回繰り返す
        for(int i = 1; i <= 100; i++) {

            //3と5の倍数の場合、FizzBuzzを出力
            if((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            }

            //3の倍数の場合、Fizzを出力
            else if(i % 3 == 0) {
                System.out.println("Fizz");
            }

            //5の倍数の場合、Buzzを出力
            else if(i % 5 == 0) {
                System.out.println("Buzz");
            }

            //それ以外の数字の場合、iを出力
            else {
                System.out.println(i);
            }
        }
    }

}

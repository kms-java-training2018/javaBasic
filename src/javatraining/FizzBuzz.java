package javatraining;

public class FizzBuzz {
     public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {

             //3の倍数かつ5の倍数の場合
            if(i % 3 == 0 && i % 5 == 0)
             {

                //Buzzを表示
                System.out.println("FizzBuzz");
            }

            //3の倍数だが5の倍数ではない場合
            else if(i % 3 == 0 && i % 5 != 0) {

                //Fizzを表示
                System.out.println("Fizz");
            }

            //5の倍数だが3の倍数ではない場合
            else if(i % 3 != 0 && i % 5 == 0) {

                //Buzzを表示
                System.out.println("Buzz");
            }

          //3の倍数でも5の倍数でもない場合
            else {

              //数字をそのまま表示
                System.out.println(i);
            }
        }
    }
}

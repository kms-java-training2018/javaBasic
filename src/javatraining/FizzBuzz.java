package javatraining;

public class FizzBuzz {

    public static void main(String[] args) {
         for (int i = 1; i < 101; i++) {
        	 //3の倍数かつ5の倍数であるとき、FizzBuzzを表示
             if((i % 3 == 0) && (i % 5 ==0)) {
                     System.out.print("FizzBuzz");
             //3の倍数のとき、Fizzを表示
             }else if (i % 3 == 0) {
                    System.out.print("Fizz");
             //5の倍数のとき、Buzzを表示
             }else if (i % 5 == 0) {
                    System.out.print("Buzz");
             //上記の条件を満たさない場合、そのままの数値を表示
             }else
                 System.out.print(i);
             System.out.println("");
         }
    }
}

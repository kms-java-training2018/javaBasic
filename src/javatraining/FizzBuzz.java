package javatraining;

public class FizzBuzz {

    public static void main(String[] args) {

        /**
         * 1～100までの数字を表示し、
         * 3の倍数であれば"Fizz"を、
         * 5の倍数であれば"Buzz"を、
         * 3の倍数であり、5の倍数でもある場合は"FizzBuzz"を
         * 数字の代わりに表示させる。
         * */
        for(int i = 1; i <= 100; i++) {
            int x =0;    //"x"=判断値
            if(i % 3 == 0) {    //"i"が3の倍数のとき、判断値に1を加える。
                x += 1;
            }
            if(i % 5 == 0) {    //"i"が5の倍数のとき、判断値に2を加える。
                x += 2;
            }
            switch(x) {    //判断値"x"の合計値によって表示を変更

            case 0:    //3の倍数でも5の倍数でもない場合
                System.out.println(i);
                break;

            case 1:    //3の倍数
                System.out.println("Fizz");
                break;

            case 2:    //5の倍数
                System.out.println("Buzz");
                break;

            case 3:    //3の倍数であり、5の倍数
                System.out.println("FizzBuzz");
                break;

            default:    //万が一の場合のエラー処理
                System.out.println("error");
                break;
            }

        }
    }

}

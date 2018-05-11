package javatraining;

public class For6_2 {

    public static void main(String[] args) {


        /**10回の間、（回数^2）個分の"*"を入力*/
        for(int count = 0; count < 10; count++) {        //回数表示と改行のfor文
            System.out.print(count + ":");
            for(int x = 0; x < (count * count); x++) {    //"*"入力のfor文
                    System.out.print("*");
            }
            System.out.println("");
        }
    }

}

package javaBasic;

public class For6_2 {
     public static void main(String[] args) {

            for (int i = 0; i <10 ; i++) {
                System.out.print(i+ ":");

                //jがiの2乗より小さい限り*を打ち続ける
                for(int j = 0; j < i*i; j++) {
                    System.out.print("*");
                }

            System.out.println("");
            }

        }
}



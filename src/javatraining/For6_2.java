package javatraining;

public class For6_2 {

    public static void main(String[] args) {

        //0から9までの数字と:を順に出力。
        //int iには数字を格納
        for (int i = 0; i < 10; i++ ) {
            System.out.print(i + ":");

            //*を出力。数字の二乗個になるまで繰り返す。
            //int jには*の個数を格納
            for (int j = 0; j <i * i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}

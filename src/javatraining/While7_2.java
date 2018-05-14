package javatraining;

public class While7_2 {
    public static void main(String[] args) {

        //行数を0からカウント
        int i = 0;

        //行数が9になるまで繰り返す
        while(i < 10) {
            int j = 0;

            //*が行数の二乗になるまで繰り返す
            while(j <i * i) {
                System.out.print("*");
                j++;
            }

            //改行する
            System.out.println("");
            i++;
        }
    }
}

package javatraining;

public class While7_2 {

    public static void main(String[] args) {
        /**(行数-1)^2個の"*"を入力する*/
        int i = 0;
        int j = 0;
        while(i < 10) {    //行ごとの処理（改行、"i"の数値上げ、"j"の初期化）
            while(j < (i * i)) {    //(行数-1)^2個の"*"を入力、"j"の数値上げ
                System.out.print("*");
                j++;
            }
        System.out.println("");
        i++;
        j = 0;
        }
    }

}

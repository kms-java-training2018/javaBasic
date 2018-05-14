package javatraining;

public class HISI {

    public static void main(String[] args) {
        //ブロック内部の縦の列
        for (int i = 0; i < 11; i++) {
            //ブロック内部の横の列
            for (int j = 0; j < 11; j++) {
                //条件式が真なら*を表示、偽なら を表示
                if (i > j - 6 && i - 6 < j && 4 - i < j && i  <  16 - j){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //改行
            System.out.println("");
        }
    }

}

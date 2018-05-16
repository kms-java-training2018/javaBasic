package javatraining;

public class MethodSquaring {

    public static void main(String[] args) {
        //引数とする数字を格納する変数を宣言
        int p, q;
         p = 100;
         //引数を2乗し結果を返す
         q =  squaring (p);
         System.out.println(p + "の2乗は" + q);

    }//計算し結果を返す
    public static int squaring (int p) {
    	return p * p;
    }
}

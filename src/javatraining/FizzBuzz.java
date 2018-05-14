package javatraining;

public class FizzBuzz {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        //変数i宣言
        int i=1;

        //100までカウント
        for (i=1 ;i<100 ; i++) {

                      //15の倍数
                  if ((i%15)==0) {
                      System.out.println("FizzBuzz");
                  }else if ((i%3)==0) {
                      //3の倍数
                      System.out.println("Fizz");
                  }else if ((i%5)==0) {
                       //5の倍数
                      System.out.println("Buzz");
                  }else {
                       //その他は数字表記
                      System.out.println(i);
                  }

        }


    }

}

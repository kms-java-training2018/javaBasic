package javatraining;

public class For6_4 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        int i,j;
        for(i = 1;i <= 9;i++) {
              for(j = 1; j <= 9; j++) {
                  System.out.print(i + "*" + j + "=" + (i * j) + ", ");
              }
              System.out.println("");
        }
    }
}

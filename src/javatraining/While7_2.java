package javatraining;

public class While7_2 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        int i = 0,j = 0;
        while(i < 10) {
            while(j < i * i) {
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;
            j = 0;
        }

    }

}

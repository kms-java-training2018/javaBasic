package javatrainig;

public class While_2 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int i = 0;
        while (i < 10 ) {
            i++;
            int j = 0;
            while (j < i * i) {
                System.out.print("*");
                j++;
            }
            System.out.println("");
        }

    }
}
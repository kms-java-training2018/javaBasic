package javatraining;

public class For6_2 {

    public static void main(String[] args) {
        // 段数の限度指定
        int dan = 10;
        // 段数表示のfor文開始
        for (int i = 0; i < dan; i++) {
            System.out.print(i + ":");
            // *記入のfor文開始
            for (int j = 0; j < i * i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}

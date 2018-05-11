package javatraining;

public class While7_2 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int i = 0;	// 1つ目While文中で使う
        int j = 0;	// 2つ目While文中で使う

        while (i < 10) {
            while (j < i * i) {
                System.out.print("*");
                j++;
            }
        System.out.println("");
        i++;
        j = 0;
        }
    }
}

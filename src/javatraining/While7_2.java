package javatraining;

public class While7_2 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        //外側while
        int i =0;
        while (i<10) {

            //中のwhile
            int j =0;
            while (j<i*i) {
                System.out.print("*");
                j++;
            }
            //改行
            System.out.println("");
            i++;
        }
    }

}

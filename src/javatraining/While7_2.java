package javatraining;

public class While7_2 {

    public static void main(String[] args) {
        //縦列用変数設定
        int i = 0;
        //10回繰り返す
        while (i < 10) {
            //横列用変数設定
            int j = 0;
            //i回繰り返す
            while (j < i) {
                //*表示
                System.out.print("*");
                //jに1を足す
                j++;
            }
            //改行
            System.out.println("");
            //iに1を足す
            i++;
        }

    }

}

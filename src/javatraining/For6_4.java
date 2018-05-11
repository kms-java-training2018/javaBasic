package javatraining;

public class For6_4 {

    //九九を表記するプログラム
    public static void main(String[] args) {
        //左の桁 9まで繰り返す
        for (int i = 1; i < 10; i++) {
            //右の桁 9まで繰り返す
            for (int j = 1; j < 10; j++) {
                //掛け算表記
                System.out.print(i + "*" + j + "=" + (i * j));
                //きれいにそろっていないので最後の答えが一桁ならスペース追加
                if ((i * j) < 10) {
                    System.out.print(" ");
                }
                //隣の桁との空白を追加
                System.out.print(", ");
            }
            //桁が上がるときに改行
            System.out.println("");
        }
    }

}

package javatrainig;

//入力に必要
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BinaryDigits1 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ



        int binaryDigits [] = new  int[5];
        binaryDigits [0] = 1;
        binaryDigits [1] = 2;
        binaryDigits [2] = 4;
        binaryDigits [3] = 8;
        binaryDigits [4] = 16;

        //3つ目の値「4」を取り出し、「3つ目の値は4です。」と出力せよ。

         // 入力用変数
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //文字を取得
        //reader.readLine();
        //数値に変換
        //Integer.parseInt();
        //数値を取得
        //Integer.parseInt(reader.readLine());

        try {
                System.out.println("3つ目の値は" + binaryDigits [2] + "です。");

        } catch (Exception e) {
            //想定外のエラー
            System.out.println("エラー");
        }

    }

}


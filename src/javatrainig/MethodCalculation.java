package javatrainig;

//入力に必要
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodCalculation {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        // 入力用変数
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //文字を取得
        //reader.readLine();
        //数値に変換
        //Integer.parseInt();
        //数値を取得
        //Integer.parseInt(reader.readLine());

        try {
            //定価
            int price;
            //支払額
            int payment;
            //おつり
            int change;
            //定価と支払額を入力してもらう
            //定価を入力(入力した値を数値に変換して代入)
            System.out.println("定価を入力してください");
            price = Integer.parseInt(reader.readLine());
            //支払額を入力
            System.out.println("支払額を入力してください");
            payment = Integer.parseInt(reader.readLine());
            //定価、支払額を引数として渡し、定価に消費税を加えて支払額から引きおつりを出すメソッドを呼び出し
            change = squaring(price, payment);

            //結果を出力
            System.out.println(payment);
        } catch (IOException e) {
            //想定外のエラー
            System.out.println("エラー");
        } catch (NumberFormatException e) {
            //数値以外がいれられたため、変換できない
            System.out.println("エラー:数値を入力してください");
        }

    }

    public static int squaring(int price, int payment) {
        //売値
        int sellPrice = (int) ((double) price * 1.08);
        //おつりをだす
        int change = payment - sellPrice;
        //おつりを返す
        return change;
    }

}

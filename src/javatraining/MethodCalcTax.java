package javatraining;

/**
 *
 * 8章講義内課題
 * 定価と支払額を入力し、
 * 定価に消費税をプラスし、支払額から税込み価格を引き、
 * おつりを出力する。
 *
 * @author iyo-marina
 *
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodCalcTax {

    public static void main(String[] args) {
        System.out.println("定価を入力してください。");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {

            // 定価を入力
            String a = reader.readLine();
            double listPrice = Integer.parseInt(a);
            System.out.println("定価は" + listPrice + "円ですね。");

            // 支払額を入力
            System.out.println("続いて、支払額を入力してください。");
            String b = reader.readLine();
            double pay = Integer.parseInt(b);
            System.out.println("支払額は" + pay + "円ですね。");

            // 消費税を計算し、おつりを出力するメソッドを呼び出し。
            int change = methodCalcTax(listPrice, pay);

            // おつりを出力する。
            System.out.println("定価" + listPrice + "円のものを、" + pay + "円で支払ったときのおつりは" + change + "円です。");

        } catch (IOException e) {
            System.out.println(e);
        }

    }

    // 消費税を計算し、おつりを出力するメソッド
    private static int methodCalcTax(double i, double j) {
        return (int) (j - (i * 1.08));
    }

}

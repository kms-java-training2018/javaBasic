package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodCalcChallenge {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            //定価の入力
            System.out.println("定価を入力してください");
            String line = reader.readLine();
            int price = Integer.parseInt(line);
            //支払額
            System.out.println("支払額を入力してください");
            String line2 = reader.readLine();
            int pay = Integer.parseInt(line2);
            //計算する
            int change = keisan(pay, price);
            System.out.println("おつりは" + change);
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("形式が正しくない。");
        }
    }//計算方法
    public static int keisan(int pay, int price) {
        double tax = 1.08;
        int calc = (int) (price * tax);
        return pay - calc;
    }//  限界でした
}

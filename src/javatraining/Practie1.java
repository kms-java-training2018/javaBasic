package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practie1 {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("数値を入力してください。");
            String input1 = reader.readLine();

            System.out.println("数値を入力してください。");
            String input2 = reader.readLine();

            System.out.println(input1 + input2);

        } catch (IOException e) {
            System.out.println("入力値取得に失敗しました。");
            e.printStackTrace();
        }
    }

}

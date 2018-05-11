package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            //1つめ
            System.out.println("1つめの値を入力してください。");
            String input1 = reader.readLine();
            //2つめ
            System.out.println("2つめの値を入力してください。");
            String input2 = reader.readLine();
            System.out.println(input1 + input2);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
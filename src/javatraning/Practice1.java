package javatraning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1{

    public static void main(String[] args) {
        System.out.println("数値1つ目を入力してください");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
        String word1 = reader.readLine();
        System.out.println("数値２つ目を入力してください");
        String word2 = reader.readLine();
        System.out.println("連結した結果はこちらです→" +word1+word2);

    } catch (IOException e) {


    }
    }
}
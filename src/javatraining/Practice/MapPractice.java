package javatraining.Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        // MapとしてHashMapのインスタンスを確保する
        Map<String, String> map = new HashMap<String, String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // キーと値のペアを追加
        map.put("アリス", "Alice");
        map.put("ボブ", "Bob");
        map.put("クリス", "Chris");
        map.put("ディアナ", "Diana");
        map.put("エルモ", "Elmo");

        System.out.println("日本語を入力してください。");
        try {
            String name = reader.readLine();
            if (map.containsKey(name)) {
                System.out.println(map.get(name));
            } else {
                System.out.println("対応する英語がありません。");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

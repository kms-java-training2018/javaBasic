package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        // MapとしてHashMapのインスタンスを確保する
        Map<String, String> map = new HashMap<String, String>();

        // キーと値のペアを追加(putメソッド)
        map.put("犬", "dog");
        map.put("猫", "cat");
        map.put("鳥", "bird");
        map.put("魚", "fish");
        map.put("人", "human");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 日本語が対応しているかどうか
        try {
            String line = reader.readLine();
            if (map.get(line) == null) {
                System.out.println("対応する英語がありません。");

            } else {
                System.out.println(map.get(line));
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
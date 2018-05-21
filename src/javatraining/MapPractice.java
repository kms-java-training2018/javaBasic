package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        // MapとしてHashMapのインスタンスを確保する
        Map<String,String> map = new HashMap<String, String>();

        // キーと値のペアを追加（putメソッド）
        map.put("猫", "cat");
        map.put("犬", "dog");
        map.put("兎","rabit");
        map.put("亀", "turtle");
        map.put("鹿", "deer");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("動物名を日本語(漢字)で入力してください。");
            String line = reader.readLine();

                // Mapのキーに入力した単語が含まれているか判定
                if (map.containsKey(line)) {
                    System.out.println(map.get(line));
                } else if (line.isEmpty()) {
                    System.out.println("さあ、動物名を日本語(漢字)で入力するんですよ!!!");
                    System.out.println("（もう一度実行してね。）");
                } else {
                    System.out.println(line + "に対応した英語は登録されていません。");
                }


        }catch (IOException e) {
            System.out.println(e);
        }

    }

}

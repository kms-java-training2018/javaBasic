//マップ問題

package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        //Mapとしてインスタンス確保
        Map<String, String> map = new HashMap<String, String>();
        map.put("猫", "cat");
        map.put("車", "car");
        map.put("香水", "perfume");
        map.put("日本", "Japan");
        map.put("地図", "map");

        System.out.println("日本語を英語に翻訳します。");
        System.out.println("好きな単語を入力してください。");
        System.out.println("辞書リスト「猫、車、香水、日本、地図」");

        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        try {
            String line = reader.readLine();
            if (map.get(line) == null) {
                System.out.println("辞書に登録されていません。");
            }else {
                System.out.println(map.get(line));
            }


        } catch (IOException e) {
            System.out.println("指定された語を入力してください。");
        }

    }

}

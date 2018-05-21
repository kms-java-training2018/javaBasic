package javatraining;

/**
*
* @author mitsuno-shinki
* 2018/05/21
* Map
* 日本語を英語に変換する
* ただし登録されていなければ「対応する英語がありません」を出力する
*
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Map型としてHashMapのインスタンスを確保
        Map<String, String> map = new HashMap<String, String>();

        try {

            //キーと値を追加
            map.put("猫", "cat");
            map.put("犬", "dog");
            map.put("牛", "cow");

            //キーボードからの入力
            System.out.println("動物の名前を入力してください");
            String line = reader.readLine();

            //もし入力された文字が登録されていれば
            if (map.get(line) != null) {
                //その値を出力
                System.out.println(map.get(line));
            } else {
                //登録がなければ、そのことを出力
                System.out.println("対応する英語がありません");
            }

        } catch (IOException e) {
            System.out.println(e);
        }

    }

}

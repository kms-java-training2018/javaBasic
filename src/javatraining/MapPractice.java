package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        /**
         * コンソールから入力した日本語に対応する英語を出力。
         * なければ"対応する日本語がありません"と出力
         */
        /**
         * マップ作成
         */
        Map<String, String> map = new HashMap<String, String>();
        /*
         * キーセット入力
         */
        map.put("猫", "cat");
        map.put("犬", "dog");
        map.put("梟", "owl");
        map.put("狼", "wolf");
        /*
         * ここまで
         */
        /**
         * 入出力
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("日本語を入力してください");
            String line = reader.readLine();
            if (map.get(line) != null) {
                // 入力したキーに対応している値を出力
                System.out.println(map.get(line));
            } else {
                // キーが存在しない場合
                System.out.println("対応する英語がありません");
            }

        } catch (IOException e) {
            System.out.println("想定外のエラー : " + e);
            e.printStackTrace();
        }
    }

}

package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

//Map課題
//コンソールから日本語を入力すると、それに対応する英語が出てくるようにしてください。

public class MapPractice {

    public static void main(String[] args) {
        //MapとしてHashMapのインスタンスを確保する
        Map<String, String> map = new HashMap<String, String>();

        //キーと値のペアを追加(getメソッド)
        map.put("マイメロ", "サンリオ");
        map.put("ミニー", "ディズニー");
        map.put("エルモ", "ユニバ");
        map.put("キティ", "サンリオ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("キャラクター名を入力してください。");
            String line = reader.readLine();
            String output = map.get(line);

            if (output == null) {
                System.out.println("対応するものがありません");
            } else {
                System.out.println(output);
            }
        } catch (IOException e) {
            System.out.println(e);

        }
    }
}

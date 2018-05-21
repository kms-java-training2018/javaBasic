package javatrainig;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();

        //キーと値のペアを追加
        map.put("犬", "dog");
        map.put("米", "rice");
        map.put("日本", "Japan");

        //入力させる
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("日本語を入力してください");

        //日本語を入力
        try {
            String line = reader.readLine();

            //キー以外の日本語が入力された場合
            if (map.get(line) == null) {
                System.out.println("登録されていません");
            //対応する日本語が入力された場合
            } else {
                System.out.println(map.get(line));
            }
        } catch (Exception e) {
            System.out.println("エラー");
        }
    }

}

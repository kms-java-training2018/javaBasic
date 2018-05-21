package javatraining.Part19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 日本語を入力すると、それに対応する英語が出てくるようにする。
 * 英語がない場合は「対応する英語がありません」を表示。
 */
public class MapPractice {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<String, String>();

        map.put("群馬", "Gunma");
        map.put("栃木", "Tochigi");
        map.put("茨城", "Ibaraki");
        map.put("埼玉", "Saitama");
        map.put("東京", "Tokyo");
        map.put("千葉", "Chiba");
        map.put("神奈川", "Kanagawa");

        try{

                System.out.println("関東地方にある都道府県を入力してください。");
                String line = reader.readLine();

                if(map.containsKey(line)) {
                    System.out.println(map.get(line));
                } else {
                    System.out.println("対応する英語がありません。");
                }
        } catch (IOException e) {
        }

    }

}

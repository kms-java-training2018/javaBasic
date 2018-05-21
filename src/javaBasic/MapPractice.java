package javaBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
    //コンソールからの読み取り準備
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //MapとしてHashMapのインスタンスを確保する
        Map<String, String> map = new HashMap<String, String>();

        //キーと値のペアを追加(putメソッド)
        map.put("猫", "cat");
        map.put("犬", "dog");
        map.put("鳥", "bird");
        map.put("魚", "fish");

        //日本語の入力を指示
        System.out.println("日本語を入力してください");


        try {
            //コンソールから入力された日本語(キー)の読み取り
            String line = reader.readLine();
            //キーがなかった場合の処理、そうでなければ値を表示
            if(map.get(line) == null) {
                System.out.println("対応する英語がありません。");
            }else {
                System.out.println(map.get(line));
            }
        }catch(IOException e) {
            System.out.println("入力が正しくありません。");
        }
    }
}

package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        //MapとしてHashMapのインスタンスを確保する
        Map<String, String> map = new HashMap<String, String>();

        //キーと値のペアを追加(putメソッド)
        map.put("春", "spring");
        map.put("夏", "summer");
        map.put("秋", "autumn");
        map.put("冬", "winter");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int choice = 1;

        //もう一度
        while (choice == 1) {
            try {
                System.out.println("季節を入力してください");
                System.out.println();

                //選択肢を表示
                for (String season : map.keySet()) {
                    System.out.println(season);
                }
                System.out.println();

                //入力をString型の変数に格納
                String s = reader.readLine();

                //入力された言葉がキーにあるかどうか
                if (map.get(s) != null) {
                    System.out.println(s + "は" + map.get(s));
                    System.out.println();
                } else {
                    System.out.println("対応する英語がありません");
                }

                //もう一度やるかどうか
                System.out.println("もう一度入力しますか？");
                System.out.println("続ける場合は１を入力してください");
                System.out.println();

                choice = Integer.parseInt(reader.readLine());

            } catch (IOException e) {
                System.out.println(e);
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        }
        System.out.println("お疲れ様でした");
    }
}

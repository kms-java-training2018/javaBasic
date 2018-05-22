package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        Map<String, String> japanese = new HashMap<String, String>();

        // キーと値のペアを追加
        japanese.put("猫", "cat");
        japanese.put("犬", "dog");
        japanese.put("カワウソ", "otter");
        japanese.put("サーバル", "serle");
        japanese.put("馬", "horse");
        japanese.put("ベルマーレ", "bellmare");
        japanese.put("", "何か入力してください");


        int yesOrNo = 1;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println(japanese.get("あ"));
            // Yesを入力した場合続ける
            while (yesOrNo == 1) {
                // 日本語の入力
                System.out.println("日本語を入力してください");
                String line = reader.readLine();
                if (japanese.containsKey(line)) {
                    System.out.println(japanese.get(line)); // 対応する英語があれば表示
                } else {
                    System.out.println("対応する英語がありません"); // 対応する英語がなければエラーメッセージを表示する
                }
                // もう一度続けるかの確認
                System.out.println("もう一度行いますか？");
                System.out.println("YES:1 / NO:0");
                line = reader.readLine();
                yesOrNo = Integer.parseInt(line);


            }
            // 終了メッセージ
            System.out.println("終了します");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}

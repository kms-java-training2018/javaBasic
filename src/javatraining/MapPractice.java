package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        // MapとしてHashMapのインスタンスを確保する
        Map<String, String> map = new HashMap<String, String>();
        //文字読み込み用変数
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 調べたいものの名前
        String name = "";
        String japanese = "";
        String english = "";
        // キーと値のペアを追加（putメソッド）
        map.put("猫", "cat");
        map.put("犬", "dog");
        map.put("end", "終了します");
        map.put("", "終了します");

        do {
            try {
                // 文字の入力
                System.out.println("調べたいものを入力してください");
                System.out.println("終わりたい場合は\"end\"またはなにも"
                        + "入力しないでください");
                name = reader.readLine();
                // 存在しているかどうか確認
                if (name.equals("new")) {
                    // 辞書に追加する文字を入力
                    System.out.println("追加したい日本語を入れてください");
                    japanese = reader.readLine();
                    System.out.println("それに対応した英語を入れてください");
                    english = reader.readLine();
                    // 新しく追加(仮)
                    // テキストに書き込むようにして上書き保存できれば
                    // 出来るかもしれない
                    map.put(japanese, english);
                } else if (map.containsKey(name)) {
                    // 辞書の中身を表示
                    System.out.println(map.get(name));
                } else {
                    // 辞書に存在していない
                    System.out.println("辞書に登録されていません");
                    System.out.println("辞書に追加する場合はnewと入れてください");
                }
                if (name.equals("end") || name.equals("")) {
                    // 終了する際の追加コメント
                    System.out.println("おつかれさまでした");;
                }
            } catch (IOException e) {
                // 予想外のエラーが起きたとき表示
                System.err.println("予想外のエラーが発生しました:" + e);
            }
            // 入力された文字が空白かendのとき終了
        } while (!name.equals("end") && !name.equals(""));

    }

}

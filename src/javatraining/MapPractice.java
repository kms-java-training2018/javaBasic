package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        //インスタンスの確保
        Map<String, String> map = new HashMap<String, String>();
        //キー(略称)と値(曲名)の追加
        map.put("エタブレ", "ETERNAL BLAZE");
        map.put("パワゲ", "POWER GATE");
        map.put("イノスタ", "innocent starter");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("以下の水樹奈々さんの曲(略称)を入力してください。");
            System.out.println("正式名称が出てきます。");
            for (String name : map.keySet()) {
                System.out.println("・" + name);
            }
            String m = reader.readLine();

            //キーが入力された場合、それに対応する値を表示
            if (map.get(m) != null) {
                System.out.println(map.get(m));
            } else {
                System.out.println("存在しない曲です");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

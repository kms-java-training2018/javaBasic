package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MapPractice {
	public static void main(String[] args) {
		// MapとしてHashMapのインスタンスを確保する
		Map<String,String> map = new HashMap<String,String>();
		
		// キーと値のペアを追加(putメソッド)
		map.put("猫", "cat");
		map.put("犬", "dog");
		map.put("紙", "paper");
		map.put("鳥", "bird");
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
        	// 処理を継続するか判定する変数を宣言
        	int loop = 0;
        	
        	// 翻訳ループ開始
        	while (loop == 0) {
        		// 入力を促す
        		System.out.println("翻訳したい日本語を入力してください。");
        
        		// 入力された日本語を取得
        		String line1 = reader.readLine();
			
        		// Map内に対応する英語があるか判断
        		if (map.get(line1) == null) {
        			// 対応する英語がない場合
        			System.out.println("対応する英語がありません");
        		
        		} else {
        			// 対応する英語がある場合
        			System.out.println("「" + line1 + "」の英語は「" + map.get(line1) + "」");
        		}
        		
    			// 継続するか判断
        		System.out.println("続けて翻訳する場合 0 を入力してください。");
        		
    			// 継続する場合0を入力する
        		String line2 = reader.readLine();
        		int judge = Integer.parseInt(line2);
        		
    			// 0以外が入力された場合終了
        		if (judge != 0) {
        			loop = 1;
        		}
        	}
        	
			// 終了する
        	System.out.println("終了します。");
			
        } catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
            System.out.println("正しい値を入力してください");
		}
	}
}
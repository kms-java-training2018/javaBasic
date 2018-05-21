package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * マップ問題
 * コンソールから日本語を入力すると、
 * それに対応する英語を出力する。
 * */
public class MapPractice {

	public static void main(String[] args) {
		/*
		 * 動物の和名と英名のペアを追加（putメソッド）
		 * */
		Map<String, String> map = new HashMap<String, String>();
		map.put("猫", "cat");
		map.put("犬", "dog");
		map.put("鳥", "bird");
		map.put("魚", "fish");
		map.put("狼", "wolf");
		map.put("豚", "pig");
		map.put("牛", "cow");
		map.put("馬", "horse");
		map.put("オオヤマネコ", "lynx");
		map.put("ゴキブリ", "cockroach");
		map.put("ネズミ", "mouse");
		map.put("コウモリ", "bats");
		map.put("ハエ", "fly");
		map.put("カエル", "flog");
		map.put("クモ", "spider");
		map.put("サソリ", "scorpion");
		map.put("カメムシ", "stink bugs");
		/*
		 * 入力の要求
		 * */
		System.out.println("動物の名前を入力してください。");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String answer = reader.readLine();
			/*
			 * 入力されたキー（日本語）がlistに登録されていれば、
			 * 対応する値（英名）を出力。
			 * 登録されていなければ、登録していないものとして出力。
			 * */
			if (map.containsKey(answer)) {
				System.out.println(answer + "の英名 =" + map.get(answer));
			} else {
				System.out.println(answer + "の英名は設定していません……。");
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}

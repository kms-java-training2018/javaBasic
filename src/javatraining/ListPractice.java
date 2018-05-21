package javatraining;

import java.util.ArrayList;

/**
 * list問題
 * 適当な数字をリストにつめて、
 * 最大値の要素番号を取得し表示する。
 * リストにつめる値は、
 * 0～99のランダムな値とする（このとき、値は一意とする）
 * ※29～33行目処理にて重複回避
 * */
public class ListPractice {
	public static void main(String[] args) {
		/*
		 * 10個のランダムな数字をlistにつめる。
		 * 数字は0～99に設定
		 * */
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			int dataNumber = (int) (Math.random() * 100);
			list.add(dataNumber);
			/**
			 * ※重複回避処理
			 * 要素を作成したとき、それまでの要素と比較し、
			 * 重複していた場合に最新の要素を削除し、
			 * 要素番号を1戻す。（最新の工程をやり直すイメージ）
			 * */
			for (int j = 0; j < i; j++) {
				if (list.get(i) == list.get(j)) {
					list.remove(i);
					i--;
				}
			}
		}
		/*
		 * 最大値の要素番号を入れる変数listNumberと、
		 * 最大値を入れる変数maxDataを、
		 * それぞれ一つ目のデータを初期値として設定。
		 * */
		int listNumber = 0;
		int maxData = list.get(0);
		/*
		 * 大小の比較判定。
		 * 要素の数値が、その時点での最大値を上回った場合、
		 * maxDataとその番号を変数に代入。
		 * */
		for (int i = 0; i < list.size(); i++) {
			if (maxData < list.get(i)) {
				maxData = list.get(i);
				listNumber = i;
			}
		}
		/*
		 * 最大値の要素番号と最大値の出力
		 * 要素番号は、0～9の数字になっているため、
		 * 要素番号に1加えたものを表示。
		 * */
		System.out.println("最大値の要素番号：" + (listNumber + 1));
		System.out.println("最大値：" + maxData);

		/**
		 * デバッグ用処理
		 * リスト内の数字を表示。
		 * */
		for (int i = 0; i < list.size(); i++) {
			System.out.print(i + 1 + " :");
			System.out.println(list.get(i));
		}
	}
}

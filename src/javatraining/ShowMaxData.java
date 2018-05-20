package javatraining;

public class ShowMaxData {
	public static void main(String[] args) {
		// データの値を入力
		int[] data = { 31,41,59,26,53,58,97,93,23,84 };
		int max_data = data[0];
		for (int i = 0; i < data.length; i++) {
			if (max_data < data[i]) {
			    max_data = data[i];
			}
		}
		// 最大値を設定
		System.out.println("最大値は" + max_data + "です。");
	}
}
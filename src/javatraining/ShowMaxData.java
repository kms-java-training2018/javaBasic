package javatraining;

public class ShowMaxData {

	public static void main(String[] args) {
		//配列宣言
		int[] data = { 31, 41, 59, 26, 53, 58, 97, 93, 23, 84 };
		int max_data = data[0];
		//最大値を探し出す
		for (int i = 0; i < data.length; i++) {
			if (max_data < data[i]) {
				max_data = data[i];
			}
		}
		//表示
        System.out.println("最大値は" + max_data + "です。");
	}

}

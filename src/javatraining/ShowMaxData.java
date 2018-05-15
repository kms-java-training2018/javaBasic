package javatraining;

public class ShowMaxData {

    public static void main(String[] args) {
        // 変数設定
        // データ配列
        int[] data = { 31, 41, 59, 26, 53, 58, 97, 93, 23, 84};
        // 最大値用変数
        int max_data = data[0];

        // 最大値取得
        for (int i = 0; i < data.length - 1; i++) {
            if (max_data < data[i + 1]) {
                max_data = data[i + 1];
            }
        }
        // 最大値表示
        System.out.println("最大値は" + max_data + "です。" );
    }
}

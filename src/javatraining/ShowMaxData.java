package javatraining;

public class ShowMaxData {

    public static void main(String[] args) {
        // 240p 9-7
        int[] data = { 31, 41, 59, 26, 53, 58, 97, 93, 23, 84};
        int max_data = data[0];
        for (int i = 0; i < data.length; i++) {	// 配列の長さまで繰り返す
            if (max_data < data[i]) {	// 参照中のdata[i]とmax_dataを比較
                max_data = data[i];	// max_dataより大きければ代入して最大値を更新
            }
        }
        System.out.println("最大値は" + max_data + "です。");

    }

}

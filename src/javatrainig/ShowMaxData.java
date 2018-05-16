package javatrainig;

public class ShowMaxData {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        // データの配列
        int[] data = { 31, 41, 59, 26, 53, 58, 97, 93, 23, 84 };

        // 最大値
        int max_data = data[0];

        // データ配列の長さまで繰り返す
        for (int i = 0; i < data.length; i++) {

            // もしも最大値より今見ているデータのほうが大きければ
            if (max_data < data[i]) {

                // 最大値に今のデータを代入
                max_data = data[i];
            }
        }
        // 最大値を表示
        System.out.println("最大値は" + max_data + "です。");
    }

}

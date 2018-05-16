package javatraining.Part9;

public class ShowMaxData {

    /*
     * 	問題9-7
     * 	配列内のデータのうち最大値を求めるプログラム
     */

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int[] data = { 31, 41, 59, 26, 53, 58, 97, 93, 23, 84 };
        // 整数型の配列の初期化と代入
        int max_data = data[0];
        // 最大値に基準値を設定
        for (int i = 0; i < data.length; i++) {
            // 配列の長さだけ最大値を比較するプログラム
            if (data[i] > max_data) {
                max_data = data[i];
            }
        }
        System.out.println("最大値は" + max_data + "です。");
        // 結果の出力
    }

}

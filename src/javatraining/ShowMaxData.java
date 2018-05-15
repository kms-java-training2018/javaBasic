package javatraining;

/**
 * 教科書　上　p.240
 * 問題9-7
 * 「最大値を求めましょう」
 * */
public class ShowMaxData {

    public static void main(String[] args) {
        /*
         * data[]の配列に数値を入れていく。
         * max_dataは最大値を入れるための変数で、初期値に0番目の数値(今回は31)を代入。
         * */
        int[] data = { 31, 41, 59, 26, 53, 58, 97, 93, 23, 84 };
        int max_data = data[0];
        /*
         * max_dataの数値とdata[]の数値を比較していき、
         * data[]の数値の方が大きい場合、max_dataにその数値を代入する。
         * */
        for (int i = 0; i < data.length; i++) { //???→data.length
            //???
            if (max_data < data[i]) {
                max_data = data[i];
            }
        }
        System.out.println("最大値は" + max_data + "です。");
    }

}

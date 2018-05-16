//要素の中から最大値を取り出す(9-7)

package javatraining;

public class ShowMaxData {

    public static void main(String[] args) {
        //dataの中身
        int[] data = { 31, 41, 59, 26, 53, 58, 97, 93, 23, 84 };
        int max_data = data[0];
        //配列の要素への代入をまとめるfor文
        for (int i = 0; i < data.length; i++) {
            //for文の条件式
            if (max_data < data[i]) {
                max_data = data[i];
            }
        }
        //結果の出力
        System.out.println("最大値は" + max_data + "です。");
    }

}

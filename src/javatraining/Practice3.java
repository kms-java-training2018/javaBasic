package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Practice3 {

	public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("バイト数を入力してください。");

        // 入力値
        int input;
        // try～catchはまだ実装していなくてもOK
        try {
            input = Integer.valueOf(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("数字に変換できる値を入力してください。処理を終了します。");
            return;
        } catch (IOException e) {
            System.out.println("入力値の読み込みに失敗しました。処理を終了します。");
            e.printStackTrace();
            return;
        }

        /** ビット変換 */
        Long bit = (long) input * 8;
        System.out.println( bit + "ビット");

        /** キロバイト変換 */
        Double kbyte =  (double) input / Math.pow(10,3);
        System.out.println(kbyte + "キロバイト");

        /** メガバイト変換 */
        BigDecimal mbyte = BigDecimal.valueOf((double) input / 1000000);
        System.out.println(mbyte + "メガバイト");

        /** ギガバイト変換 */
        String gbyte = BigDecimal.valueOf((double) input / Math.pow(10,9)).toPlainString();
        System.out.println(gbyte + "ギガバイト");

        /** テラバイト変換 */
        String tbyte = BigDecimal.valueOf((double) input / 1000000000000L).toPlainString();
        System.out.println(tbyte + "テラバイト");
    }
}

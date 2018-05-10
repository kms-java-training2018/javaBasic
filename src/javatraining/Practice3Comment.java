package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Practice3Comment {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("バイト数を入力してください。");

        // 入力値
        int input;
        // try～catchは実装なくてもOK
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
        // キャスト
        System.out.println("ビット変換 ====================================");
        Long bit = (long) input * 8;
        System.out.println("【正】(long) input * 8 = " + bit + "ビット");
        System.out.println("【解説】1byte=8bitなので、入力値より大きい値になることが予想できるので、longでキャストしておこう。\n");


        /** キロバイト変換 */
        System.out.println("キロバイト変換 ====================================");
        Double kbyteOk =  (double) input / 1000;
        System.out.println("【正】(double)input / 1000 = " + kbyteOk + "キロバイト");
        System.out.println("【解説】1byte=0.001KBなので、小数となることが予想できるのでfloatかdoubleでキャストしよう。");
        System.out.println("【解説】でもfloatかdoubleかで迷ったら、精度が高いdoubleにしよう。\n");

        Double kbyteOk2 =  (double) input / Math.pow(10,3);
        System.out.println("【別解】(double) input / Math.pow(10,3) = " + kbyteOk2 + "キロバイト");
        System.out.println("【解説】指定した値でべき乗を計算してくれるMath.pow()を使ってもOK！\n");

        Double kbyteNg =  (double) (input / 1000);
        System.out.println("【誤】(double) (input / 1000) = " + kbyteNg + "キロバイト");
        System.out.println("【解説】計算結果の値をキャストしても手遅れ感があります。\n");


        /** メガバイト変換 */
        System.out.println("メガバイト変換 ====================================");
        // 正解バージョン
        BigDecimal mbyteOk = BigDecimal.valueOf((double) input / 1000000);
        System.out.println("【正】BigDecimal.valueOf((double) input / 1000000) = " + mbyteOk + "メガバイト");
        System.out.println("【解説】入力数値が小さいと指数表示となる。それを回避するためにDigDecimalを使用しよう。");
        System.out.println("【別解】キロバイト変換と同様\n");

        // 惜しいバージョン
        Double mbyteNg = (double) input / 1000000;
        System.out.println("【惜しい】(double) input / 1000000 = " + mbyteNg + "メガバイト");
        System.out.println("【解説】入力数値が小さいと指数表示となる。問題2としては正解！\n");


        /** ギガバイト変換 */
        System.out.println("ギガバイト変換 ====================================");
        String gbyteOk = BigDecimal.valueOf((double) input / 1000000000).toPlainString();
        System.out.println("【正】BigDecimal.valueOf((double) input / 1000000000).toPlainString() = " +
                gbyteOk + "ギガバイト");
        System.out.println("【解説】BigDecimalクラスのtoPlainStringでありのままを表示してあげよう。");
        System.out.println("【別解】キロバイト変換と同様\n");

        // 惜しいバージョン1
        BigDecimal regrettableAns1 = BigDecimal.valueOf((double) input / 1000000000);
        System.out.println("【惜しい1】BigDecimal.valueOf((double) input / 1000000000) = " +
                regrettableAns1 + "ギガバイト");
        System.out.println("【解説】BigDecimalでは0.0000001(10のマイナス7乗)からは指数表記(E)が出現する。問題2としては正解！\n");

        // 惜しいバージョン2
        BigDecimal regrettableAns2 =  BigDecimal.valueOf((double) input).divide(BigDecimal.valueOf(1000000000));
        System.out.println("【惜しい2】BigDecimal.valueOf((double) input).divide(BigDecimal.valueOf(1000000000)) = " +
                regrettableAns2.divide(BigDecimal.valueOf(1000000000)) + "ギガバイト");
        System.out.println("【解説】BigDecimalでは0.0000001(10のマイナス7乗)からは指数表記(E)が出現する。問題2としては正解！");
        System.out.println("【解説】惜しい1と惜しい2の表記の違いは、桁数の表現の違いのようです。");
        System.out.println("【解説】惜1 = " + regrettableAns1 + " = " + regrettableAns1.toPlainString());
        System.out.println("【解説】惜2 = " + regrettableAns2 + " = " + regrettableAns2.toPlainString() + "\n");


        /** テラバイト変換 */
        System.out.println("テラバイト変換 ====================================");
        String tbyteOk = BigDecimal.valueOf((double) input / 1000000000000L).toPlainString();
        System.out.println("【正】BigDecimal.valueOf((double) input / 1000000000000L).toPlainString() = " +
                tbyteOk + "テラバイト");
        System.out.println("【解説】ギガバイトと同様");
        System.out.println("【別解】キロバイト変換と同様\n");
    }
}

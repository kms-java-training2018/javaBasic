package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practie4 {
    public static void main(String[] args) {

    	// 人日の時間(1人日=8時間)
    	final int MAN_DAY_UNIT = 8;

    	// 人月の日数(1人月=20日)
    	final int MAN_MONTH_UNIT = 20;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int hour = 0;
        try {
            System.out.println("時間を入力してください。");
            hour = Integer.valueOf(reader.readLine());

            // 分に変換
            Long min = hour * 60L;
            System.out.println(min + "分");

            // 秒に変換
            Long sec = min * 60;
            System.out.println(sec + "秒");

            // 人日に変換
            Double md =  hour / (double) MAN_DAY_UNIT;
            System.out.println(md + "人日");

            // 人月に変換
            Double mm = hour / (double) (MAN_DAY_UNIT * MAN_MONTH_UNIT);
            System.out.println(mm + "人月");

        } catch (NumberFormatException e) {
            System.out.println("数字に変換できる値を入力してください。処理を終了します。");
            return;
        } catch (IOException e) {
            System.out.println("入力値取得に失敗しました。処理を終了します。");
            e.printStackTrace();
        }
    }

}

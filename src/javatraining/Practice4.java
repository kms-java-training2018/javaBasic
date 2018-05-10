package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4 {

    public static void main(String[] args) {
      System.out.println("時間を入力してください");
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      try {
          String line;
          line = reader.readLine();
          int x = Integer.parseInt(line);
          // 時間定義
          int man_day = 8;
          int man_month = 20;


          // 変換作業
          // 秒に変換
          long byou = x * 60 * 60;
          // 分に変換
          int hun = x * 60;
          // 人日に変換
          double ninbi =(double) x / man_day;
          // 人月に変換
          double ningetsu =(double) x / (man_day * man_month);

          // 出力作業
          // 秒を出力
          System.out.println(byou + "秒");
          // 分を出力
          System.out.println(hun + "分");
          // 人日を出力
          System.out.println(ninbi + "人日");
          // 人月を出力
          System.out.println(ningetsu + "人月");

      } catch (IOException e) {
          System.out.println(e);
      } catch (NumberFormatException e) {
          System.out.println("");
      }

    }

}

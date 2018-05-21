package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Seiza {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

         BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));

            try {

                //誕生月の入力。不正な数値を入れるとシステム終了。
                System.out.println("誕生月を入力してください");
                String line = reader.readLine();
                int tsuki = Integer.parseInt(line);

                if(tsuki < 1 || 12 < tsuki) {
                    System.out.println("正確な日付を入力してください");
                    System.exit(1);
                }

              //誕生日の入力。不正な数値を入れるとシステム終了。
                System.out.println("誕生日を入力してください");
                String line2 = reader.readLine();
                int niti = Integer.parseInt(line2);

                if(niti < 1 || 31 < niti) {
                    System.out.println("正確な日付を入力してください");
                    System.exit(1);
                }

                //1月の場合
                if(tsuki == 1) {
                    if(1 <= niti && niti <= 20) {
                        System.out.println("あなたは山羊座です。");
                    }else if(niti <= 31) {
                        System.out.println("あなたは水瓶座です。");
                    }else{
                        System.out.println("正確な日付を入力してください");
                    }
                }

              //2月の場合
                if(tsuki == 2) {
                    if(1 <= niti && niti <= 18) {
                        System.out.println("あなたは水瓶座です。");
                    }else if(niti <= 29) {
                        System.out.println("あなたは魚座です。");
                    }else{
                        System.out.println("正確な日付を入力してください");
                    }
                }

              //3月の場合
                if(tsuki == 3) {
                    if(1 <= niti && niti <= 20) {
                        System.out.println("あなたは魚座です。");
                    }else if(niti <= 31) {
                        System.out.println("あなたは牡羊座です。");
                    }else{
                        System.out.println("正確な日付を入力してください");
                    }
                }

              //4月の場合
                if(tsuki == 4) {
                    if(1 <= niti && niti <= 19) {
                        System.out.println("あなたは牡羊座です。");
                    }else if(niti <= 30) {
                        System.out.println("あなたは牡牛座です。");
                    }else{
                        System.out.println("正確な日付を入力してください");
                    }
                }

              //5月の場合
                if(tsuki == 5) {
                    if(1 <= niti && niti <= 20) {
                        System.out.println("あなたは牡牛座です。");
                    }else if(niti <= 31) {
                        System.out.println("あなたは双子座です。");
                    }else{
                        System.out.println("正確な日付を入力してください");
                    }
                }

              //6月の場合
                if(tsuki == 6) {
                    if(1 <= niti && niti <= 21) {
                        System.out.println("あなたは双子座です。");
                    }else if(niti <= 30) {
                        System.out.println("あなたは蟹座です。");
                    }else{
                        System.out.println("正確な日付を入力してください");
                    }
                }

              //7月の場合
                if(tsuki == 7) {
                    if(1 <= niti && niti <= 22) {
                        System.out.println("あなたは蟹座です。");
                    }else if(niti <= 31) {
                        System.out.println("あなたは獅子座です。");
                    }else{
                        System.out.println("正確な日付を入力してください");
                    }
                }

              //8月の場合
                if(tsuki == 8) {
                    if(1 <= niti && niti <= 22) {
                        System.out.println("あなたは獅子座です。");
                    }else if(niti <= 31) {
                        System.out.println("あなたは乙女座です。");
                    }else{
                        System.out.println("正確な日付を入力してください");
                    }
                }

              //9月の場合
                if(tsuki == 9) {
                    if(1 <= niti && niti <= 22) {
                        System.out.println("あなたは乙女座です。");
                    }else if(niti <= 30) {
                        System.out.println("あなたは天秤座です。");
                    }else{
                        System.out.println("正確な日付を入力してください");
                    }
                }

              //10月の場合
                if(tsuki == 10) {
                    if(1 <= niti && niti <= 23) {
                        System.out.println("あなたは天秤座です。");
                    }else if(niti <= 31) {
                        System.out.println("あなたは蠍座です。");
                    }else{
                        System.out.println("正確な日付を入力してください");
                    }
                }

              //11月の場合
                if(tsuki == 11) {
                    if(1 <= niti && niti <= 22) {
                        System.out.println("あなたは蠍座です。");
                    }else if(niti <= 30) {
                        System.out.println("あなたは射手座です。");
                    }else{
                        System.out.println("正確な日付を入力してください");
                    }
                }

              //12月の場合
                if(tsuki == 12) {
                    if(1 <= niti && niti <= 21) {
                        System.out.println("あなたは射手座です。");
                    }else if(niti <= 31) {
                        System.out.println("あなたは山羊座です。");
                    }else{
                        System.out.println("正確な日付を入力してください");
                    }
                }
            } catch(IOException e) {
                System.out.println(e);
            }catch(NumberFormatException e) {
                System.out.println("正しくありません");
            }
    }
}

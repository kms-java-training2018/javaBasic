package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Star {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("生まれた月を入力してください。");

            //生まれた月を変数へ格納
            String month = reader.readLine();

            System.out.println("生まれた日を入力してください。");

            //生まれた日を変数へ格納
            String day = reader.readLine();

            //月日を文字列として連結し、数値へ変更
            int birthday = Integer.parseInt(month + day);

            //星座毎の月日を数値として(例 8/2→82)条件分岐させる。
            if((321 <= birthday && birthday <= 331) ||
                    (41 <= birthday && birthday <= 49) ||
                    (410 <= birthday && birthday <= 419)) {
                System.out.println("あなたの星座はおひつじ座です。");
            }else if((420 <= birthday && birthday <= 430) ||
                    (51 <= birthday && birthday <= 59) ||
                    (510 <= birthday && birthday <= 520)){
                System.out.println("あなたの星座はおうし座です。");
            }else if((521 <= birthday && birthday <= 531) ||
                    (61 <= birthday && birthday <= 69) ||
                    (610 <= birthday && birthday <= 621)){
                System.out.println("あなたの星座はふたご座です。");
            }else if((622 <= birthday && birthday <= 630) ||
                    (71 <= birthday && birthday <= 79) ||
                    (710 <= birthday && birthday <= 722)){
                System.out.println("あなたの星座はかに座です。");
            }else if((723 <= birthday && birthday <= 731) ||
                    (81 <= birthday && birthday <= 89) ||
                    (810 <= birthday && birthday <= 822)){
                System.out.println("あなたの星座はしし座です。");
            }else if((823 <= birthday && birthday <= 831) ||
                    (91 <= birthday && birthday <= 99) ||
                    (910 <= birthday && birthday <= 922)){
                System.out.println("あなたの星座はおとめ座です。");
            }else if((923 <= birthday && birthday <= 930) ||
                    (101 <= birthday && birthday <= 109) ||
                    (1010 <= birthday && birthday <= 1023)){
                System.out.println("あなたの星座はてんびん座です。");
            }else if((1024 <= birthday && birthday <= 1031) ||
                    (111 <= birthday && birthday <= 119) ||
                    (1110 <= birthday && birthday <= 1122)){
                System.out.println("あなたの星座はさそり座です。");
            }else if((1123 <= birthday && birthday <= 1130) ||
                    (121 <= birthday && birthday <= 129) ||
                    (1210 <= birthday && birthday <= 1221)){
                System.out.println("あなたの星座はいて座です。");
            }else if((1222 <= birthday && birthday <= 1231) ||
                    (11 <= birthday && birthday <= 19) ||
                    (110 <= birthday && birthday <= 119)){
                System.out.println("あなたの星座はやぎ座です。");
            }else if((120 <= birthday && birthday <= 131) ||
                    (21 <= birthday && birthday <= 29) ||
                    (210 <= birthday && birthday <= 218)){
                System.out.println("あなたの星座はみずがめ座です。");
            }else if((219 <= birthday && birthday <= 229) ||
                    (31 <= birthday && birthday <= 39) ||
                    (310 <= birthday && birthday <= 320)){
                System.out.println("あなたの星座はうお座です。");
            }else {
                System.out.println("誕生日として不適切です。");
            }
        }catch (IOException e) {
            System.out.println(e);
        }catch (NumberFormatException e) {
            System.out.println("数字の形式が正しくありません。");
        }
    }
}

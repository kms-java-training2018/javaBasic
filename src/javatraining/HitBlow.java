package javatraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HitBlow {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {

            int kazu[] = { 0, 0, 0 };

            int i = 0;
            while (i < 3) {
                kazu[i] = (int) (Math.random() * 10);
                if (i == 1) {
                    if (kazu[i] == kazu[i - 1]) {
                        continue;
                    }
                } else if (i == 2) {
                    if (kazu[i] == kazu[i - 1] || kazu[i] == kazu[i - 2]) {
                        continue;
                    }
                }
                i++;
            }

            //変数宣言
            String line;
            int input[] = { 0, 0, 0 };

            int hitcount, blowcount, turncount;
            turncount = 1;

            do {
                i = 0;
                hitcount = 0;
                blowcount = 0;
                System.out.println("ターン" + turncount);

                while (i < 3) {
                    System.out.println((i + 1) + "番目の数字を入力してください");
                    line = reader.readLine();
                    input[i] = Integer.parseInt(line);
                    if (input[i] < 0 || 9 < input[i]) {
                        System.out.println("範囲内の数字をお願いします");
                        continue;
                    }
                    if (i == 1) {
                        if (input[i - 1] == input[i]) {
                            System.out.println("重複しないようにお願いします");
                            continue;
                        }
                    } else if (i == 2) {
                        if (input[i - 2] == input[i] || input[i - 1] == input[i]) {
                            System.out.println("重複しないようにお願いします");
                            continue;
                        }
                    }
                    i++;
                }

                int j = 0;
                i = 0;

                for (i = 0; i < 3; i++) {
                    for (j = 0; j < 3; j++) {
                        if (kazu[i] == input[j] && i == j) {
                            hitcount++;
                        } else if (kazu[i] == input[j] && i != j) {
                            blowcount++;
                        }
                    }
                }

                System.out.println("hit:" + hitcount);
                System.out.println("blow:" + blowcount);
                if (hitcount != 3) {
                    System.out.println("\n残念！ もう一回\n");
                }

                turncount++;

            } while (hitcount < 3);
            System.out.println("\n大正解!おめでとう");

        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字をお願いします");
        }

    }

}

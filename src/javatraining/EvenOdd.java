package javatraining;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * 【奇数・偶数のリストを表示しよう（EvenOdd）】
 * 0から10までの乱数を発生させてその値を表示し、
 * 0が出たら、それまで入力した整数をすべて、奇数・偶数にわけて表示するプログラムを作ってください。
 * ただし表示は以下の出力結果サンプルのようにしてください。
 * ①0が出るまで発生した0～10までの数字を表示する→○
 * ②奇数・偶数それぞれの値を入れたArrayListを一意の値となるようにし、
 * 　かつ昇順に表示する
 *
 * @author iyo-marina
 *
 */

public class EvenOdd {
//====宣言==============================================================================================================
//----フィールド--------------------------------------------------------------------------------------------------------
    // 乱数発生ループ判定用（falseになったら終了）
    public static boolean continuation = true;

    // 発生させた整数格納用リスト(重複は格納しない)
    static ArrayList<Integer> evenNum = new ArrayList<Integer>();	// 偶数リスト
    static ArrayList<Integer> oddNum = new ArrayList<Integer>();	// 奇数リスト

//----コンストラクタ----------------------------------------------------------------------------------------------------


//----メソッド----------------------------------------------------------------------------------------------------------
    // リスト内の値を昇順に並べて表示させる
    static void sort (String displayName, ArrayList<Integer> listName) {
        Collections.sort(listName);
        System.out.println(displayName + "：" + listName);
    }


//====メインメソッド====================================================================================================

    public static void main(String[] args) {

        // 0~10の値を発生させ、表示。（0が出た場合、ループを抜ける）
        while (continuation) {
            // 0~10の範囲で値を1つ生成(リストに入る値の候補)
            Random rnd = new Random();
            int number = rnd.nextInt(11);
            System.out.println("0〜10の値を出力：" + number);

            // 発生させた整数が0の場合
            if (number == 0) {
                continuation = false;

            // 発生させた整数が偶数　かつ　偶数リストに重複がない場合
            } else if ( number % 2 == 0 && evenNum.contains(number) == false ) {
                evenNum.add(number);

            // 発生させた整数が奇数　かつ　奇数リストに重複がない場合
            } else if (number % 2 == 1 && oddNum.contains(number) == false) {
                oddNum.add(number);

            }
        }

        // 奇数リストの値を昇順で表示
        sort("奇数", oddNum);


     // 偶数リストの値を昇順で表示
        sort("偶数", evenNum);

    }

}

package javatraining;

/**
* 2018/05/21
* 三野進紀
* 4～7章課題⑥
* アスタリスクでひし形描画
* */

public class Hishigata {

    /**
     * 引数なしコンストラクタ
     */
    Hishigata() {
    }

    /**
     * それぞれの値に応じてアスタリスクを出力
     * @param n
     */
    void Dia(int n) {
        if (n == 1) {
            System.out.println("     *");
        } else if (n == 3) {
            System.out.println("    ***");
        } else if (n == 5) {
            System.out.println("   *****");
        } else if (n == 7) {
            System.out.println("  *******");
        } else if (n == 9) {
            System.out.println(" *********");
        } else if (n == 11) {
            System.out.println("***********");
        }

    }

    /**
     * メインメソッド
     * @param args
     */
    public static void main(String[] args) {
        int i;
        //インスタンス作成
        Hishigata d = new Hishigata();

        //11まで2ずつ増える
        for (i = 1; i <= 11; i += 2) {
            //メソッド呼び出し
            d.Dia(i);
        }

        //このときのiの値は13なので、-2する
        i -= 2;

        //ひし形にするにはiの値を9にする必要があるので、iの値を-2して1になるまで2ずつ減らす
        for (i -= 2; i >= 1; i -= 2) {
            //メソッド呼び出し
            d.Dia(i);
        }

    }

}

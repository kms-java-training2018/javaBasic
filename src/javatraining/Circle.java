package javatraining;

// 円のデータが入っているクラス
public class Circle {
    // 半径
    int radics;
    // 円周率
    private static final double pi = 3.14;

    //---------------------------------------
    // 引数なしコンストラクタ
    //---------------------------------------
    Circle() {
        // 半径設定
        radics = 10;
    }

    //---------------------------------------
    // 引数ありコンストラクタ
    //---------------------------------------
    Circle(int rad) {
        // 半径設定
        radics = rad;
    }

    //----------------------------------------
    // 面積計算
    //----------------------------------------
    public double areaReturn() {
        // 面積を求め返す
        return (double)(radics * radics) * pi;
    }

    //----------------------------------------
    // 円周計算
    //----------------------------------------
    public double circumferenceReturn() {
        // 円周を求め返す
        return (double)(radics * 2) * pi;
    }
}

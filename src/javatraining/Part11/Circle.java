package javatraining.Part11;

/**
 *	円クラス
 * @author teranoshita-yuta
 */
public class Circle {
    int radius; // 半径
    final double PI = 3.14;

    /**
     *	コンストラクタ
     */
    Circle() {
        setRadius(10);
    }

    /**
     *	コンストラクタ
     * @param r 半径
     */
    Circle(int r) {
        setRadius(r);
    }

    /**
     *	半径設定
     * @param r 半径
     */
    void setRadius(int r) {
        radius = r;
    }

    /**
     *	円周計算
     * @return 円周
     */
    double getCircumference() {
        return radius * 2 * PI;
    }

    /**
     *	面積計算
     * @return 面積
     */
    double getArea() {
        return radius * radius * PI;
    }
}

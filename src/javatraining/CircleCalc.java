package javatraining;
// 二つの円の面積の和と円周の和を求める
public class CircleCalc {

    public static void main(String[] args) {
        // 円クラス1を生成
        Circle cir1 = new Circle();
        // 円クラス2を作成
        Circle cir2 = new Circle(1);
        // 円の面積の和を表示
        System.out.println(cir1.areaReturn() + cir2.areaReturn());
        // 円の円周の和を表示
        System.out.println(cir1.circumferenceReturn() + cir2.circumferenceReturn());
    }

}

package javaBasic;
/**
 * テキスト(下)p.75
 * 問題12-5
 */
public class PlacedRectangle{

    //Rectangle型のインスタンス変数を宣言
    Rectangle nr;

    //位置を表すint型のフィールドx,yを設定
    int x;
    int y;

    //(1)引数なしのコンストラクタを設定
    PlacedRectangle(){
        nr = new Rectangle();
        setLocation(0,0);
    }
    //(2)位置付きのコンストラクタを設定
    PlacedRectangle(int x, int y){
        nr = new Rectangle();
        setLocation(x,y);
    }
    //(3)位置と大きさ付きのコンストラクタを設定
    PlacedRectangle(int x, int y, int width, int height){
        nr = new Rectangle(width, height);
        setLocation(x,y);
    }
    //位置を変更するメソッドsetLocationを設定
    void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //標準的な文字列表現を返すメソッドtoStringを設定
    @Override
    public String toString() {
        return ("[("+ x + "," + y + ")"+ nr + "]");
    }


    public static void main(String[] args) {
    //確認用にインスタンスnr3を作成
        PlacedRectangle nr3 = new PlacedRectangle(3,4,19,43);
        System.out.println(nr3.toString());
    }
}

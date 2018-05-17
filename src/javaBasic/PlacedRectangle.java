package javaBasic;
/**
 * テキスト(下)p.74
 * 問題12-4
 */
public class PlacedRectangle extends Rectangle{

    //位置を表すint型のフィールドx,yを設定
    int x;
    int y;

    //(1)引数なしのコンストラクタを設定
    PlacedRectangle(){
        setLocation(0,0);
    }
    //(2)位置付きのコンストラクタを設定
    PlacedRectangle(int x, int y){
            super(10,20);
            this.x = x;
            this.y = y;
    }
    //(3)位置と大きさ付きのコンストラクタを設定
    PlacedRectangle(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    //位置を変更するメソッドsetLocationを設定
    void setLocation(int x, int y) {
        this.width = x;
        this.height = y;
    }
    //標準的な文字列表現を返すメソッドtoStringを設定
    @Override
    public String toString() {
        return ("[("+ x + "," + y + ")["+ width + ","+ height + "]]");
    }


    public static void main(String[] args) {
    //確認用にインスタンスnr3を作成
        PlacedRectangle nr3 = new PlacedRectangle(3,4,19,43);
        System.out.println(nr3.toString());
    }
}

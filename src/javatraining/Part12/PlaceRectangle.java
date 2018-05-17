package javatraining.Part12;

public class PlaceRectangle{

    Rectangle r;
    //フィールド(位置)
    int x;
    int y;

    //引数なしコンストラクタ
    PlaceRectangle(){
        r = new Rectangle (2,8);
        setLocation(0,0);
    }

    //位置付きコンストラクタ
    PlaceRectangle(int x, int y){
        r = new Rectangle (2,8);
        this.x = x;
        this.y = y;
    }

    //位置と大きさ付きコンストラクタ
    PlaceRectangle(int x, int y, int width, int height){
        r = new Rectangle (2,8);
        this.x = x;
        this.y = y;
        r.width = width;
        r.height = height;
    }

    //位置を変更するメソッド
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //標準的な文字列表現を返すメソッド
    @Override
    public String toString() {
        return "[(" + x + ","+ y + ")" + super.toString() + "]";
    }

    public static void main(String[] args) {

        PlaceRectangle pr = new PlaceRectangle (12, 34, 123, 45);
        String result = pr.toString();
        System.out.println(result);
    }

}

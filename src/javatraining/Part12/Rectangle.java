package javatraining.Part12;

public class Rectangle {

    //フィールド
    int width;
    int height;

    //引数なしコンストラクタ
    Rectangle(){
        setSize(0, 0);
    }

    //引数ありコンストラクタ
    Rectangle(int width, int height){
        setSize(width, height);
    }

    //コンストラクタ
    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "[" + width + "," + height + "]";
    }
}


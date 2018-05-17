package javatraining;

/**
 * 教科書　下　p.20
 * */

/*
 * クラスRectangleの宣言
 * フィールドの宣言
 * */
class Rectangle {
	int width;
	int height;

	Rectangle() {
		setSize(0, 0);
	}

	Rectangle(int width, int height) {
		setSize(width, height);
	}

	void setSize(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "[" + width + "," + height + "]";
	}

}

package javatraning;

public class Rectangle {

		int width;
		int height;

		//コンストラクタ
		Rectangle(){
			setSize(0,0);
		}

		Rectangle(int width,int height){
			setSize(width,height);
		}


		void setSize(int width,int height) {
			this.width = width;
			this.height = height;

		}
		int getArea() {
			return width * height;
		}

		@Override
		public String toString() {
			return "{"+ width + "." + height + "}";
			}

	}



package javatraning;

public class BinaryDigits2 {

	public static void main(String[] args) {
		//配列の定義
		int binaryDigits[] = new int[5];
		binaryDigits[0] = 1;
		binaryDigits[1] = 2;
		binaryDigits[2] = 4;
		binaryDigits[3] = 18;
		binaryDigits[4] = 16;

		//配列の中身を繰り返し表示するfor文

		for (int i = 0; i < binaryDigits.length;i++) {

			//○番目のためのz
			int z = i + 1;
			System.out.println("配列"+ z +"つ目の値は、" + binaryDigits[i] + "です。");
		}



	}

}

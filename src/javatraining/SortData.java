package javatraining;

public class SortData {

	public static void main(String[] args) {
		//配列宣言
		int[] data = {31, 41, 59, 26, 53, 58, 97, 93, 23, 84 };
		System.out.println("並び替える前");
		//表示
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}//表示
        System.out.println("");
        for(int i = 0; i < data.length - 1; i++) {
        	for (int j = i + 1; j < data.length; j++) {
        		if (data[i] > data[j]) {
        			//交換
        			int n = data[i];
        			data[i] = data[j];
        			data[j] = n;
        		}
        	}
        }
        //表示
        System.out.println("並び替えた後");
        for (int i = 0; i < data.length; i++) {
        	System.out.print(data[i] + " ");
        }
        System.out.println("");
	}

}

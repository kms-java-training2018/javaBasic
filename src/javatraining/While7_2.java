package javatraining;

public class While7_2 {

	public static void main(String[] args) {
		// 182p 7-2
		int i = 0;
		int j = 0;
		while (i < 10) {
			j = 0;
			while(j < i * i) {
				System.out.print("*");
				j++ ;
				
			}
			System.out.println("");
			i++ ;
		}

	}

}

package javatraining.Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1 {
	public static void main(String[] args) {
			String[] line;
			line = new String[2];
            int[] numcheck;
            numcheck = new int[2];

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			try {
			    for(int i = 0; i < 2; i++)
			    {
				    System.out.printf("%dつ目の数値を入力してください%n",i+1);
		            line[i] = reader.readLine();
		            numcheck[i] = Integer.parseInt(line[i]);
			    }

			    System.out.println(line[0]+line[1]);
			}
			catch(IOException e) {
		    	System.out.println(e);
			}
		    catch(NumberFormatException e) {
		    	System.out.println("数値が正しくありません");
		    }
	}
}


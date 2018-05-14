package javatraning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class NumberHit {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {

			//正解の数字をランダムで決定する
			Random rand = new Random();
			int AN = rand.nextInt(99);

			System.out.println("数を当ててね(0～99)を入力して！");

			//正解が当たるまで入力させるWhile文
			//正解判定のフラグ(1なら正解)
			int i = 0;
			//正解が当たるまで入力させるWhile文

			while (i < 1) {
				try {

					String line = reader.readLine();
					int pl = Integer.parseInt(line);
					//正解判定
					if (pl < 0 || pl > 99) {
						System.out.println("0~99を入力して！次を入力！");

					}else if (AN == pl) {
						System.out.println("あなたは" + pl + "正解は" + AN + "\nあたり！");
						i = 1;

					//正解の方が大きい場合
					} else if (AN > pl) {
						System.out.println("残念。もっと大きいよ！次を入力して！");

					//正解の方が大きい場合
					} else
						System.out.println("残念。もっと小さいよ！次を入力して！");

					} catch (NumberFormatException e) {
					System.out.println("0~99を入力して！次を入力！");

					}

				}

		} catch (IOException e) {

	}
	}

}

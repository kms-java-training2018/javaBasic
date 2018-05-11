package javatraining;

public class For6_2 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ":");
            for (int j = 0; j < (i * i); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
// 以下逆に出力するようのfor文。
// 題外の内容のため、コメントアウトしてあります。
//        for (int i = 9; i >= 0; i--) {
//           System.out.print(i + ":");
//           for (int j = 0; j < (i * i); j++) {
//               System.out.print("*");
//           }
//           System.out.println("");
//        }

    }

}

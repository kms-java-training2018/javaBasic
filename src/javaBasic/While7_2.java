package javaBasic;

public class While7_2 {
     public static void main(String[] args) {
         System.out.println("");

         int i = 0;
         while (i <9) {
             i++;

             int j = 0;
             while(j < i) {
                 System.out.print("*");
                 j++;
             }

         System.out.println("");
         }

     }
}

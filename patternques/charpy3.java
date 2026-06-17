/*   to print character pyramid 
      A 
    A B A 
  A B C B A 
A B C D C B A  */

import java.util.Scanner;

public class charpy3 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter length of character pyramid: ");
            int leng = sc.nextInt();

            // ouuter loop for number of rows
            for (int i = 1; i <= leng; i++) {

                // part 1 for spaces
                for (int j = 1; j <= leng - i; j++) {
                    System.out.print("  ");
                }

                // part 2 for printing characters
                for (int j = 1; j <= i; j++) {

                    int a = j;
                    int b = 'A' - 1;
                    int ans = a + b;
                    char finalans = (char) ans;

                    System.out.print(finalans + " ");
                }

                // part 2 for printing next half pattern
                char toPrint = (char) (i + 'A' - 2);
                for (int j = 2; j <= i; j++) {
                    System.out.print(toPrint + " ");
                    toPrint--;
                }
                // for next line
                System.out.println();
            }
        }
    }
}

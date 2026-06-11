// to print butterfly using star

import java.util.Scanner;

public class butterfly {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter length of pyramid: ");
            int leng = sc.nextInt();

            // outerloop for number of rows for upper half

            for (int i = 1; i <= leng; i++) {

                for (int j = 1; j <= i; j++) {

                    System.out.print("*");
                }
                // innerloop for space

                for (int j = 1; j <= (leng * 2) - (2 * i); j++) {

                    System.out.print(" ");
                }
                // innerloop for star

                for (int j = 1; j <= i; j++) {

                    System.out.print("*");
                }
                System.out.println();
            }

            // lower half pattern and outer loop for number of row

            for (int i = leng; i >= 1; i--) {

                for (int j = 1; j <= i; j++) {

                    System.out.print("*");
                }
                // innerloop for space

                for (int j = 1; j <= (leng * 2) - (2 * i); j++) {

                    System.out.print(" ");
                }
                // innerloop for star

                for (int j = 1; j <= i; j++) {

                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }
}
